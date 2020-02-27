package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TemperaturePrinter {
    public void run() {

        String url = "http://api.openweathermap.org/data/2.5/weather?q=Shuzenji&appid=b6ada6c936536304134229eab080b093&units=metric";
        String urlMoney = "http://api.nbp.pl/api/exchangerates/rates/a/chf/?format=json";
        RestTemplate restTemplate = new RestTemplate();
        WeatherAnswer weatherAnswer = restTemplate.getForObject(url, WeatherAnswer.class);

        Codebeautify codebeautify = restTemplate.getForObject(urlMoney, Codebeautify.class);

        System.out.println("Temperatura w Suenzi: " + weatherAnswer.getMain().getTemp() + "*C" + " Wilgotność w Suenzji: " + weatherAnswer.getMain().getHumidity() +
                "ciśnienie: " + weatherAnswer.getMain().getPressure() + " hektarów");

        System.out.println("Hajs? " + codebeautify.getCurrency() + " " + codebeautify.getRates().getMid());
    }
}
