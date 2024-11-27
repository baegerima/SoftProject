package com.example.chyraistyle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class ChyraiStyleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChyraiStyleApplication.class, args);
    }

}
