package com.kuba.controller;


import com.kuba.service.CurrentWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrentWeatherController {
    private final CurrentWeatherService currentWeatherService;

    @Autowired
    public CurrentWeatherController(CurrentWeatherService currentWeatherService) {
        this.currentWeatherService = currentWeatherService;
    }

    @RequestMapping("/weather")
    public String hello(){
        return "This is really great weather!";
    }

    @GetMapping("/current-weather-{city}")
    public String getWeather(@RequestParam String city) {
        return currentWeatherService.objectToJson();
    }




}
