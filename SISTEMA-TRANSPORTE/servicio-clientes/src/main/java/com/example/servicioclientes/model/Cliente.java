package com.example.servicioclientes.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "El nombre no puede estar vacío")
    private String nombre;

    @NotEmpty(message = "El apellido no puede estar vacío")
    private String apellido;

    @Email(message = "Debe ser un correo válido")
    @NotEmpty(message = "El correo no puede estar vacío")
    private String email;

    // Otros atributos adicionales

    // Getters y Setters
}
