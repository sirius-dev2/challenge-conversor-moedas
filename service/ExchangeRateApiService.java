package br.com.alura.currencyconverter.service;
import br.com.alura.currencyconverter.model.ExchangeRateResponse;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateApiService {
    public static double getExchangeRate(String baseCurrency, String targetCurrency){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://v6.exchangerate-api.com/v6/sua-chave/latest/" + baseCurrency)).build();
        HttpResponse<String> response= null;
        try {
             response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Failed to get a response");
        }
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
        ExchangeRateResponse deserializedResponse = gson.fromJson(response.body(), ExchangeRateResponse.class);
        return switch (targetCurrency) {
            case "BRL" -> deserializedResponse.conversionRates().getBrl();
            case "USD" -> deserializedResponse.conversionRates().getUsd();
            case "EUR" -> deserializedResponse.conversionRates().getEur();
            case "GBP" -> deserializedResponse.conversionRates().getGbp();
            case "JPY" -> deserializedResponse.conversionRates().getJpy();
            case "CNY" -> deserializedResponse.conversionRates().getCny();
            case "ARS" -> deserializedResponse.conversionRates().getArs();
            case "COP" -> deserializedResponse.conversionRates().getCop();
            default -> throw new RuntimeException("Failed to get the exchange rate");
        };
    }
}
