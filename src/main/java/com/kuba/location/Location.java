package com.kuba.location;

import com.google.gson.annotations.SerializedName;
import com.kuba.currentWeather.CurrentWeather;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data

@Component
public class Location {

    private Integer locationId;
    private double latitude;
    private double longitude;
    @SerializedName("current_weather")
    private CurrentWeather currentWeather;


}
