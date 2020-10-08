package com.example.study.retrofit2;

import com.example.study.entities.Currency;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface CurrencyPlaceHolder {

    @GET("pubinfo")
    Call<List<Currency>> getCurrency(@Query("exchange")String exchange,
                                     @Query("json") String json,
                                     @Query("coursid") int coursId);
}
