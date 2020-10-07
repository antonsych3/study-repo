package org.example.retrofit2;

import com.google.gson.annotations.SerializedName;

public class Currency {

    private String ccy;

    @SerializedName("base_ccy")
    private String baseCcy;

    private double buy;
    private double sale;

    public String getCcy() {
        return ccy;
    }

    public String getBaseCcy() {
        return baseCcy;
    }

    public double getBuy() {
        return buy;
    }

    public double getSale() {
        return sale;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "ccy='" + ccy + '\'' +
                ", baseCcy='" + baseCcy + '\'' +
                ", buy=" + buy +
                ", sale=" + sale +
                '}';
    }
}
