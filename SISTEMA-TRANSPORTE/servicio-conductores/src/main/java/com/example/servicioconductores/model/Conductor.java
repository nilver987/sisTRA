package com.example.servicioconductores.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "conductores")
public class Conductor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "El nombre no puede estar vacío")
    private String nombre;

    @NotEmpty(message = "El apellido no puede estar vacío")
    private String apellido;

    @NotEmpty(message = "El número de licencia no puede estar vacío")
    @Pattern(regexp = "^[A-Za-z0-9]+$", message = "El número de licencia no es válido")
    private String numeroLicencia;

    private String fechaContratacion;

    // Otros atributos como dirección, teléfono, etc.

    // Getters y Setters
}
