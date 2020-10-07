package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.retrofit2.Currency;
import org.example.retrofit2.CurrencyPlaceHolder;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

import java.io.IOException;
import java.util.List;

public class App {

    public static void main( String[] args ) throws IOException {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.privatbank.ua/p24api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        CurrencyPlaceHolder currencyPlaceHolder = retrofit.create(CurrencyPlaceHolder.class);

        Call<List<Currency>> call = currencyPlaceHolder.getCurrency("", "", 11);
        call.enqueue(new Callback<List<Currency>>() {
            @Override
            public void onResponse(Call<List<Currency>> call, Response<List<Currency>> response) {
                if (!response.isSuccessful()){
                    System.out.println(response.errorBody());
                    return;
                }
                List<Currency> currencies = response.body();
                for (Currency c:currencies) {
                    System.out.println(c);
                }
            }

            @Override
            public void onFailure(Call<List<Currency>> call, Throwable throwable) {
                throwable.printStackTrace();
            }
        });
    }
}

