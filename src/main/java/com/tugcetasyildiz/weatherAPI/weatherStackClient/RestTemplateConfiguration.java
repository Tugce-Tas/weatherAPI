package com.tugcetasyildiz.weatherAPI.weatherStackClient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfiguration {

    @Bean("weatherRestTemplate")
    public RestTemplate createRestTemplate() {
        return new RestTemplate();
    }
}
