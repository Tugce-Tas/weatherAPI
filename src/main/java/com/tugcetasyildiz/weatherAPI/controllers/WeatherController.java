package com.tugcetasyildiz.weatherAPI.controllers;

import com.tugcetasyildiz.weatherAPI.weatherStackClient.WeatherStackClient;
import com.tugcetasyildiz.weatherAPI.weatherStackClient.models.WeatherResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/weather")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherStackClient weatherStackClient;

    @GetMapping("{city}/{countryCode}/{startDate}/{endDate}")
    public ResponseEntity<WeatherResponse> getWeather(@PathVariable String city,
                                                      @PathVariable String countryCode,
                                                      @PathVariable String startDate,
                                                      @PathVariable String endDate) {
        return ResponseEntity.ok(weatherStackClient.getWeatherForecast(city,countryCode,startDate,endDate));
    }
}
