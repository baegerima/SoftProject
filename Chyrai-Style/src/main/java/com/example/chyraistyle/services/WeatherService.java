package com.example.chyraistyle.services;

import com.example.chyraistyle.entities.WeatherEntity;
import com.example.chyraistyle.repositories.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class WeatherService {

    @Autowired
    private WeatherRepository weatherRepository;

    public WeatherEntity saveWeatherData(WeatherEntity weatherEntity) {
        weatherEntity.setLastUpdated(LocalDateTime.now());
        return weatherRepository.save(weatherEntity);
    }

    public WeatherEntity getWeatherByCity(String city) {
        return weatherRepository.findByCity(city);
    }
}
