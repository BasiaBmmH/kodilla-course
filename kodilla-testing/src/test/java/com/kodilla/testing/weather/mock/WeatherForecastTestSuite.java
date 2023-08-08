package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;
    Map<String, Double> temperaturesMap = new HashMap<>();

    @BeforeEach
    void data() {
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
    }

    @Test
    void testCalculateForecastWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(temperaturesMap.size(), quantityOfSensors);
    }

    @Test
    void testCalculateAverage() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        //When
        double average = weatherForecast.calculateAverage();

        //Then
        Assertions.assertEquals(25.56, average);

    }


    @Test
    void testCalculateAverageForZeroForecasts() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        when(temperaturesMock.getTemperatures()).thenReturn(Collections.emptyMap());

        //When
        double average = weatherForecast.calculateAverage();

        //Then
        Assertions.assertEquals(0.00, average);

    }

    @Test
    void testCalculateMedian(){
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        //When
        double median = weatherForecast.calculateMedian();

        //Then
        Assertions.assertEquals(25.5, median);

    }
}