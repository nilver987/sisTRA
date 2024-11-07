package com.example.serviciogeolocalizacion.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "ubicaciones")
public class Ubicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "La latitud no puede ser nula")
    private Double latitud;

    @NotNull(message = "La longitud no puede ser nula")
    private Double longitud;

    private Long idConductor;

    private Long idVehiculo;

    // Getters y Setters
}
