package com.example.study.retrofit2;

import com.example.study.entities.Currency;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.util.List;

@Service
public class CallbackService implements Callback<List<Currency>> {

    Callback<List<Currency>> currencyCallback;
    List<Currency> currencies;

    public CallbackService() {
        currencyCallback = this;
    }

    public void start(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.privatbank.ua/p24api/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        CurrencyPlaceHolder currencyPlaceHolder = retrofit.create(CurrencyPlaceHolder.class);

        Call<List<Currency>> call = currencyPlaceHolder.getCurrency("", "", 11);
        call.enqueue(currencyCallback);
    }

    @Override
    public void onResponse(Call<List<Currency>> call, Response<List<Currency>> response) {
        if (!response.isSuccessful()){
            System.out.println(response.errorBody());
            return;
        }
        currencies = response.body();
        for (Currency c:currencies) {
            System.out.println(c);
        }
    }

    @Override
    public void onFailure(Call<List<Currency>> call, Throwable throwable) {
        throwable.printStackTrace();
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }
}
