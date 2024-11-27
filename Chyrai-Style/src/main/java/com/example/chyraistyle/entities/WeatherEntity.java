package com.example.chyraistyle.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "weather")
public class WeatherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String city;
    private String description;
    private double temperature;
    private double humidity;
    private double windSpeed;

    @Column(name = "last_updated")
    private LocalDateTime lastUpdated;

    public void setLastUpdated(LocalDateTime now) {
    }

    // Геттеры и сеттеры
}
