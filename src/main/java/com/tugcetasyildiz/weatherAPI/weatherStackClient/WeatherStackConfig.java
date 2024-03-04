package com.tugcetasyildiz.weatherAPI.weatherStackClient;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "weather-api")
@Data
@Component
public class WeatherStackConfig {

    private String baseUrl;
    private String apiKey;
}
