package com.kuba.currentWeather;

import com.kuba.apiData.MainData;
import com.kuba.apiData.WeatherData;
import com.kuba.apiData.WindData;
import com.kuba.config.ApplicationConfig;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CurrentWeatherServiceTest {

    private final String SOURCE_JSON = """
            {
              "coord": {
                "lon": 21.0118,
                "lat": 52.2298
              },
              "weather": [
                {
                  "id": 800,
                  "main": "Clear",
                  "description": "clear sky",
                  "icon": "01n"
                }
              ],
              "base": "stations",
              "main": {
                "temp": 7.68,
                "feels_like": 5.67,
                "temp_min": 4.26,
                "temp_max": 8.79,
                "pressure": 1016,
                "humidity": 55
              },
              "visibility": 10000,
              "wind": {
                "speed": 3.09,
                "deg": 140
              },
              "clouds": {
                "all": 0
              },
              "dt": 1679175538,
              "sys": {
                "type": 2,
                "id": 2032856,
                "country": "PL",
                "sunrise": 1679114664,
                "sunset": 1679157836
              },
              "timezone": 3600,
              "id": 756135,
              "name": "Warsaw",
              "cod": 200
            }""";

    @Mock
    private CurrentWeatherRequest request;

    @Mock
    private ApplicationConfig config;

    @Mock
    private CurrentWeatherDtoMapper mapper;
    @InjectMocks
    private CurrentWeatherService service;


    @Test
    public void shouldGetObject() {
        //Arrange
        String city = "warsaw";
        CurrentWeather currentWeather = new CurrentWeather(
                1L,
                List.of(new WeatherData("Clear", "clear sky")),
                new WindData(3.09),
                new MainData(7.68, 55.0)
        );
        CurrentWeatherDto currentWeatherDto = new CurrentWeatherDto(
                List.of(new WeatherData("Clear", "clear sky")),
                new WindData(3.09),
                new MainData(7.68, 55.0)
        );

        when(request.getCurrentWeatherFromJson(city)).thenReturn(currentWeather);
        when(mapper.mapToCurrentWeatherDTO(currentWeather)).thenReturn(currentWeatherDto);

        //Act
        CurrentWeatherDto expectedCurrentWeather = service.getCurrentWeather(city);

        //Assert
        assertEquals(expectedCurrentWeather.getMainData(), currentWeatherDto.getMainData());
        assertEquals(expectedCurrentWeather.getWeatherData(), currentWeatherDto.getWeatherData());
        assertEquals(expectedCurrentWeather.getWindData(), currentWeatherDto.getWindData());
    }
}