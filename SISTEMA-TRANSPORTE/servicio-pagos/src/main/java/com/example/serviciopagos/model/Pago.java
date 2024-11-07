package com.example.serviciopagos.model.pagos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long reservaId;  // ID de la reserva asociada
    private Double monto;  // Monto del pago
    private String metodoPago;  // Ejemplo: 'tarjeta', 'efectivo'
    private Date fechaPago;  // Fecha en que se realizó el pago
    private String estado;  // Ejemplo: 'completado', 'pendiente', 'fallido'

    public Pago() {
    }

    public Pago(Long reservaId, Double monto, String metodoPago, Date fechaPago, String estado) {
        this.reservaId = reservaId;
        this.monto = monto;
        this.metodoPago = metodoPago;
        this.fechaPago = fechaPago;
        this.estado = estado;
    }

    // Getters y setters
    // ...
}
