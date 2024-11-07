package com.transporte.serviciohorarios.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Horario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long rutaId;
    private Long busId;
    private LocalDateTime horaSalida;
    private LocalDateTime horaLlegada;

    // Getters y setters
}
