package com.tugcetasyildiz.weatherAPI.weatherStackClient.models;

import lombok.Data;

import java.util.HashMap;

@Data
public class Stations {
    private HashMap<String, Station> stations;

}