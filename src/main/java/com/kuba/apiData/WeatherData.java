package com.kuba.apiData;

import com.google.gson.annotations.SerializedName;
import jdk.jfr.Description;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@NoArgsConstructor
@AllArgsConstructor
public class WeatherData {
    @SerializedName("main")
    private String main;
    @SerializedName("description")
    private String description;



}
