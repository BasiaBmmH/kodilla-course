package com.kodilla.spring.testing.weather.stub;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 Celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverage() {
        double average = 0;
        Map<String, Double> map = temperatures.getTemperatures();
        for (Map.Entry<String, Double> temperature : map.entrySet()) {
            average = average + temperature.getValue();
        }
        return map.isEmpty() ? 0.00 : average / map.size();
    }

    public double calculateMedian () {
        Collection<Double> values = temperatures.getTemperatures().values();

        Double[] sorted = values.toArray(new Double[0]);
        Arrays.sort(sorted);

        int medianIndex = sorted.length / 2;
        double median;

        if (sorted.length % 2 == 0) {
            median = (sorted[medianIndex - 1] + sorted[medianIndex]) / 2;
        } else {
            median = sorted[medianIndex];
        }

        return median;
    }

    }