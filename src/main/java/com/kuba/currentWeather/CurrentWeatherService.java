package com.kuba.currentWeather;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CurrentWeatherService {
    private final String API_KEY = "2161be548b4aa191dfaf00aff64d7033";
    private final String URL_CURRENT_WEATHER_PART_1 = "https://api.openweathermap.org/data/2.5/weather?q=";
    private final String URL_CURRENT_WEATHER_PART_2 = "&units=metric&appid=";

    private final CurrentWeatherRequest request;
    private final CurrentWeatherDtoMapper mapper;

    public CurrentWeatherService(CurrentWeatherRequest request, CurrentWeatherDtoMapper mapper) {
        this.request = request;
        this.mapper = mapper;
    }

    //    public String objectToJson(){
//        return gson.toJson(getCurrentWeatherForSpecificLocationFromExternalApi(), Location.class);
//    }
//
    public CurrentWeatherDto getCurrentWeather(String city) {
        return mapper.mapToCurrentWeatherDTO(request.getCurrentWeatherFromJson(city));
    }

}
