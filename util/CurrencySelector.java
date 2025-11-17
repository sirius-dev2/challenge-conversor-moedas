package br.com.alura.currencyconverter.util;

public class CurrencySelector {
    public static String getCurrency(int option){
        return switch (option) {
            case 1 -> "BRL";
            case 2 -> "USD";
            case 3 -> "EUR";
            case 4 -> "GBP";
            case 5 -> "JPY";
            case 6 -> "CNY";
            case 7 -> "ARS";
            case 8 -> "COP";
            default -> throw new RuntimeException("Invalid currency option: " + option);
        };
    }
}
