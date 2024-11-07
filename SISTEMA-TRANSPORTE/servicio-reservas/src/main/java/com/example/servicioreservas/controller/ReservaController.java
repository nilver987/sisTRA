package com.example.servicioreservas.model.reservas.controller;

import com.example.servicioreservas.model.reservas.model.Reserva;
import com.example.servicioreservas.model.reservas.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservas")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @PostMapping
    public Reserva crearReserva(@RequestBody Reserva reserva) {
        return reservaService.crearReserva(reserva);
    }

    @GetMapping
    public List<Reserva> obtenerReservas() {
        return reservaService.obtenerReservas();
    }

    @GetMapping("/{id}")
    public Reserva obtenerReservaPorId(@PathVariable Long id) {
        return reservaService.obtenerReservaPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarReserva(@PathVariable Long id) {
        reservaService.eliminarReserva(id);
    }
}
