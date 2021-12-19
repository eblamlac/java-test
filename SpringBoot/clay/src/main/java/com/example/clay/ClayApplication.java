package com.example.clay;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication

public class ClayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClayApplication.class, args);
    }

}
