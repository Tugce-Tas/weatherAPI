package com.tugcetasyildiz.weatherAPI.weatherStackClient;

import com.tugcetasyildiz.weatherAPI.weatherStackClient.models.WeatherResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
@Slf4j
public class WeatherStackClient {

    private final RestTemplate weatherRestTemplate;
    private final WeatherStackConfig weatherStackConfig;

    public WeatherResponse getWeatherForecast(String city, String countryCode, String startDate, String endDate) {
        String requestUrl = new StringBuilder()
                .append(weatherStackConfig.getBaseUrl())
                .append(city)
                .append(",")
                .append(countryCode)
                .append("/")
                .append(startDate)
                .append("/")
                .append(endDate)
                .append("?key=")
                .append(weatherStackConfig.getApiKey())
                .toString();

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<?> request = new HttpEntity<>(httpHeaders);

        try {
            ResponseEntity<WeatherResponse> response = weatherRestTemplate
                    .exchange(requestUrl, HttpMethod.GET, request, WeatherResponse.class);
            return response.getBody();
        } catch (Exception e) {
            log.error(e.getMessage());
            return null;
        }

    }
}
