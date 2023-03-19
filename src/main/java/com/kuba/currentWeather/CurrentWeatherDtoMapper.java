package com.kuba.currentWeather;

import org.springframework.stereotype.Component;


@Component
public class CurrentWeatherDtoMapper {

    public CurrentWeatherDto mapToCurrentWeatherDTO(CurrentWeather currentWeather){
        return new CurrentWeatherDto(
                currentWeather.getWeather(),
                currentWeather.getWind(),
                currentWeather.getMain()
        );
    }
}
