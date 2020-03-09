package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CurrencuPrinter {
    public void run() {


        String urlMoney = "http://api.nbp.pl/api/exchangerates/rates/a/chf/?format=json";
        RestTemplate restTemplate = new RestTemplate();


        Codebeautify codebeautify = restTemplate.getForObject(urlMoney, Codebeautify.class);
        MainRates mainRates = restTemplate.getForObject(urlMoney, MainRates.class);
        System.out.println("Waluta: " + codebeautify.getCurrency() + ". Kurs: " + mainRates.getRates().get(0).getMid());
    }
}
