package com.kuba.currentWeather;

import ch.qos.logback.classic.servlet.LogbackServletContainerInitializer;
import com.kuba.config.ApplicationConfig;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.context.annotation.Configuration;


@Slf4j
@Configuration
public class CurrentWeatherRequest {
    private final String API_KEY = "2161be548b4aa191dfaf00aff64d7033";
    private final String API_URL_PART_1 = "https://api.openweathermap.org/data/2.5/weather?q=";
    private final String API_URL_PART_2 = "&units=metric&appid=";
    private final ApplicationConfig applicationConfig;

    public CurrentWeatherRequest(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
    }


    public String requestCurrentWeather(String city){
        return applicationConfig.getRestTemplate().getForObject(getUrl(city), String.class);
    }

    public CurrentWeather getCurrentWeatherFromJson(String city){
        return applicationConfig.getGsonObject().fromJson(requestCurrentWeather(city), CurrentWeather.class);
    }
    private String getUrl(String city){
        return API_URL_PART_1  + city + API_URL_PART_2 + API_KEY;
    }
}
