package com.example.notificaciones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServicioNotificacionesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicioNotificacionesApplication.class, args);
    }
}
