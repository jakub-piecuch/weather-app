package com.kuba.currentWeather;

import com.google.gson.annotations.SerializedName;
import com.kuba.apiData.MainData;
import com.kuba.apiData.WeatherData;
import com.kuba.apiData.WindData;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;


@Getter
@Setter
@Component
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CurrentWeather {

    private Long currentWeatherId;
    @SerializedName("weather")
    private List<WeatherData> weather;
    @SerializedName("wind")
    private WindData wind;
    @SerializedName("main")
    private MainData main;
}
