package com.tugcetasyildiz.weatherAPI.weatherStackClient.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WeatherResponse {
    private int queryCost;
    private double latitude;
    private double longitude;
    private String resolvedAddress;
    private String address;
    private String timezone;
    private double tzoffset;
    private String description;
    private List<Day> days;
    private List<Object> alerts;
    private Stations stations;
    private CurrentConditions currentConditions;
}