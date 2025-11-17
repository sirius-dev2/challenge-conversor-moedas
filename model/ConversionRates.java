package br.com.alura.currencyconverter.model;

import com.google.gson.annotations.SerializedName;

public class ConversionRates {
    @SerializedName("BRL")
    double brl;
    @SerializedName("USD")
    double usd;
    @SerializedName("EUR")
    double eur;
    @SerializedName("GBP")
    double gbp;
    @SerializedName("JPY")
    double jpy;
    @SerializedName("CNY")
    double cny;
    @SerializedName("ARS")
    double ars;
    @SerializedName("COP")
    double cop;

    public double getBrl() {
        return brl;
    }

    public double getUsd() {
        return usd;
    }

    public double getEur() {
        return eur;
    }

    public double getGbp() {
        return gbp;
    }

    public double getJpy() {
        return jpy;
    }

    public double getCny() {
        return cny;
    }

    public double getArs() {
        return ars;
    }

    public double getCop() {
        return cop;
    }
}
