package com.kuba.currentWeather;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/v1")
public class CurrentWeatherController {
    private final CurrentWeatherService currentWeatherService;
    private final CurrentWeatherRequest currentWeatherRequest;

    @Autowired
    public CurrentWeatherController(CurrentWeatherService currentWeatherService, CurrentWeatherRequest currentWeatherRequest) {
        this.currentWeatherService = currentWeatherService;
        this.currentWeatherRequest = currentWeatherRequest;
    }

    @GetMapping("/current-weather-{city}")
    public ResponseEntity<CurrentWeatherDto> getWeather(@PathVariable String city) {
        CurrentWeatherDto currentWeatherDto = currentWeatherService.getCurrentWeather(city);
        return new ResponseEntity<>(currentWeatherDto, HttpStatus.OK);
    }

//    @RequestMapping("/weather")
//    public String hello(){
//        return "This is really great weather!";
//    }
//
//    @GetMapping("/current-weather-{city}")
//    public String getWeather(@RequestParam String city) {
//        return currentWeatherService.objectToJson();
//    }


}
