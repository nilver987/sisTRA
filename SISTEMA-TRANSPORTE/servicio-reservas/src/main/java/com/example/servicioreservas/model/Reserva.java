package com.example.servicioreservas.model.reservas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long clienteId;
    private Long busId;
    private Long rutaId;
    private Date fechaReserva;
    private String estado;  // Ejemplos: 'confirmada', 'cancelada', 'pendiente'

    public Reserva() {
    }

    public Reserva(Long clienteId, Long busId, Long rutaId, Date fechaReserva, String estado) {
        this.clienteId = clienteId;
        this.busId = busId;
        this.rutaId = rutaId;
        this.fechaReserva = fechaReserva;
        this.estado = estado;
    }

    // Getters y setters

}
