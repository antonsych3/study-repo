package com.example.rest_soap_rabbit.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

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
