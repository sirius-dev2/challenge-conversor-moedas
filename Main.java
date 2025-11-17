package br.com.alura.currencyconverter;
import br.com.alura.currencyconverter.service.ExchangeRateApiService;
import br.com.alura.currencyconverter.ui.AppInterface;
import br.com.alura.currencyconverter.util.CurrencySelector;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AppInterface.showIntro();
        AppInterface.showMenu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number that corresponds to your currency:");
        String baseCurrency = CurrencySelector.getCurrency(scanner.nextInt());
        System.out.println("Enter the amount to exchange");
        double amount = scanner.nextDouble();
        System.out.println("Please enter the number corresponding to the desired currency:");
        String targetCurrency = CurrencySelector.getCurrency(scanner.nextInt());
        double exchangeRate = ExchangeRateApiService.getExchangeRate(baseCurrency, targetCurrency);
        double convertedAmount = amount * exchangeRate;
        System.out.println("Base currency: " + baseCurrency);
        System.out.println("Amount: " + amount);
        System.out.println("Exchange rate: " + exchangeRate);
        System.out.println("Converted Amount:" + convertedAmount);
    }
}
