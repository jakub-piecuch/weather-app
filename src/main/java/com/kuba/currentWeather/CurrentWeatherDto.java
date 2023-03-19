package com.kuba.currentWeather;

import com.kuba.apiData.MainData;
import com.kuba.apiData.WeatherData;
import com.kuba.apiData.WindData;
import com.sun.tools.javac.Main;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class CurrentWeatherDto {
    private List<WeatherData> weatherData;
    private WindData windData;
    private MainData mainData;
}
