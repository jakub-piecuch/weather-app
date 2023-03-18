package com.kuba.model;

import com.google.gson.annotations.SerializedName;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Component
@Table(name="current_weather_informations")
public class CurrentWeather {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Integer currentWeatherId;
    private double temperature;
    @SerializedName("windspeed")
    private double windSpeed;
    @SerializedName("winddirection")
    private double windDirection;
    @SerializedName("time")
    private String timeStamp;

    public int getCurrentWeatherId() {
        return currentWeatherId;
    }

    public void setCurrentWeatherId(int currentWeatherId) {
        this.currentWeatherId = currentWeatherId;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public double getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(double windDirection) {
        this.windDirection = windDirection;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "CurrentWeather{" +
                "id=" + currentWeatherId +
                ", temperature=" + temperature +
                ", windSpeed=" + windSpeed +
                ", windDirection=" + windDirection +
                ", timeStamp='" + timeStamp + '\'' +
                '}';
    }
}
