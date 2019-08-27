package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TemperaturePrinter {
    public void run() {

        String url = "http://api.openweathermap.org/data/2.5/weather?q=London&appid=b6ada6c936536304134229eab080b093&units=metric";
        RestTemplate restTemplate = new RestTemplate();
        WeatherAnswer weatherAnswer = restTemplate.getForObject(url, WeatherAnswer.class);

        System.out.println("Temperatura w Londynie: " + weatherAnswer.getMain().getTemp() + "*C");
    }
}
