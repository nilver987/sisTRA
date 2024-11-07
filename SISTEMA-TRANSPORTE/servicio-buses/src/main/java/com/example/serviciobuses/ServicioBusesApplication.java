package com.example.serviciobuses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServicioBusesApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServicioBusesApplication.class, args);
    }
}
