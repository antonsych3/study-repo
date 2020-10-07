package org.example.retrofit2;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface CurrencyPlaceHolder {

    @GET("pubinfo")
    Call<List<Currency>> getCurrency(@Query("exchange")String exchange, @Query("json") String json, @Query("coursid") int coursId);
}
