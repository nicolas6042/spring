package com.domain.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public HashMap<Integer, Double> calculateForecast() {
        HashMap<Integer, Double> resultMap = new HashMap<>();

        for (Map.Entry<Integer, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(),temperature.getValue()+1);
        }
        return resultMap;
    }
}
