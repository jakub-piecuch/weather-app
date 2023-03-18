package com.kuba.service;

import com.google.gson.Gson;
import com.kuba.controller.CurrentWeatherController;
import com.kuba.model.Location;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CurrentWeatherService {
    private final String URI_CURRENT_WEATHER = "https://api.open-meteo.com/v1/forecast?latitude=52.23&longitude=21.01&current_weather=true";
    private static final Logger LOG = LoggerFactory.getLogger(CurrentWeatherController.class);
    private final Gson gson;
    private final RestTemplate restTemplate;

    public CurrentWeatherService() {
        this.gson = new Gson();
        this.restTemplate = new RestTemplate();
    }
    public String objectToJson(){
        return gson.toJson(getCurrentWeatherForSpecificLocationFromExternalApi(), Location.class);
    }

    public Location getCurrentWeatherForSpecificLocationFromExternalApi() {
        return gson.fromJson(restTemplate.getForObject(URI_CURRENT_WEATHER, String.class), Location.class);
    }



}
