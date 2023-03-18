package com.kuba.model;

import com.google.gson.annotations.SerializedName;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Component
@Table(name="locations")
public class Location {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Integer locationId;
    private double latitude;
    private double longitude;
    @SerializedName("current_weather")
    private CurrentWeather currentWeather;

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public CurrentWeather getCurrentWeather() {
        return currentWeather;
    }

    public void setCurrentWeather(CurrentWeather currentWeather) {
        this.currentWeather = currentWeather;
    }

    @Override
    public String toString() {
        return "Location{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", currentWeather=" + currentWeather +
                '}';
    }
}
