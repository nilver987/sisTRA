package com.example.servicioreservas.model.reservas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServicioReservasApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicioReservasApplication.class, args);
    }
}
