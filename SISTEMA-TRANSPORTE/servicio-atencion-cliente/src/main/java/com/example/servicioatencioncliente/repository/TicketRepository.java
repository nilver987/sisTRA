package com.example.servicioatencioncliente.repository;

import com.example.servicioatencioncliente.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    // Aquí se pueden agregar métodos personalizados si es necesario
}
