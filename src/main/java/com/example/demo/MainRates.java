package com.example.demo;

import java.util.ArrayList;

public class MainRates {
    ArrayList< CurrencyRates > rates = new ArrayList< CurrencyRates >();

    public ArrayList<CurrencyRates> getRates() {
        return rates;
    }

    public void setRates(ArrayList<CurrencyRates> rates) {
        this.rates = rates;
    }
}
