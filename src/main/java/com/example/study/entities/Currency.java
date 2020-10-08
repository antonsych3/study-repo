package com.example.study.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class Currency {

    @JsonProperty("base_ccy")
    private String baseCcy;

    private String ccy;
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
