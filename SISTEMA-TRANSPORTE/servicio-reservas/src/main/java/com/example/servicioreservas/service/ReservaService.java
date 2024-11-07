package com.example.servicioreservas.model.reservas.service;

import com.example.servicioreservas.model.reservas.model.Reserva;
import com.example.servicioreservas.model.reservas.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    public Reserva crearReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    public List<Reserva> obtenerReservas() {
        return reservaRepository.findAll();
    }

    public Reserva obtenerReservaPorId(Long id) {
        return reservaRepository.findById(id).orElse(null);
    }

    public void eliminarReserva(Long id) {
        reservaRepository.deleteById(id);
    }
}
