package br.com.alura.currencyconverter.ui;

public class AppInterface {
    public static void showIntro(){
        System.out.println("Welcome! Let’s convert some currencies.");
    }
    public static void showMenu(){
        System.out.println("""
                [1] Real (BRL)
                [2] Dollar (USD)
                [3] Euro (EUR)
                [4] Pound Sterling (GBP)
                [5] Yen (JPY)
                [6] Yuan (CNY)
                [7] Argentine Peso (ARS)
                [8] Colombian Peso (COP)""");
    }
}
