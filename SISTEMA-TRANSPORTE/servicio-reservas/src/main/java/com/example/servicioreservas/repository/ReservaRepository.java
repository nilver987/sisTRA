package com.example.servicioreservas.model.reservas.repository;

import com.example.servicioreservas.model.reservas.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
}
