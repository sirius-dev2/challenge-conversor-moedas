# Currency Converter

## Descrição
Um aplicativo de console em Java para conversão de moedas. Ele permite que o usuário selecione uma moeda base, insira um valor e escolha uma moeda alvo para realizar a conversão utilizando a API de câmbio [ExchangeRate API](https://www.exchangerate-api.com/).

## Tecnologias utilizadas
- Java 17+
- [Gson](https://github.com/google/gson) para deserialização de JSON
- Java HTTP Client (`java.net.http.HttpClient`) para requisições HTTP

## Funcionalidades
- Seleção de moeda base e moeda alvo a partir de um menu.
- Consulta de taxa de câmbio em tempo real via API.
- Cálculo e exibição do valor convertido.
- Suporte para várias moedas: BRL, USD, EUR, GBP, JPY, CNY, ARS, COP.

## Estrutura do projeto
```plaintext
br.com.alura.currencyconverter/
├── model/
│   ├── ConversionRates.java
│   └── ExchangeRateResponse.java
├── service/
│   └── ExchangeRateApiService.java
├── ui/
│   └── AppInterface.java
├── util/
│   └── CurrencySelector.java
└── Main.java
