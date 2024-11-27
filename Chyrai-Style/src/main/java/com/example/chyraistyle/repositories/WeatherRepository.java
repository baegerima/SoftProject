package com.example.chyraistyle.repositories;

import com.example.chyraistyle.entities.WeatherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherRepository extends JpaRepository<WeatherEntity, Long> {
    // Если вам понадобятся дополнительные методы, например, поиск по названию города:
    WeatherEntity findByCity(String city);
}
