package com.example.chyraistyle.controllers;

import com.example.chyraistyle.entities.WeatherEntity;
import com.example.chyraistyle.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    // Получить информацию о погоде по названию города
    @GetMapping("/{city}")
    public WeatherEntity getWeatherByCity(@PathVariable String city) {
        return weatherService.getWeatherByCity(city);
    }

    // Сохранить информацию о погоде
    @PostMapping
    public WeatherEntity saveWeatherData(@RequestBody WeatherEntity weatherEntity) {
        return weatherService.saveWeatherData(weatherEntity);
    }
}
