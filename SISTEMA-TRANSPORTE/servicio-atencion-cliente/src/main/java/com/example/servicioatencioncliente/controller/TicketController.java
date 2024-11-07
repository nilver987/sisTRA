package com.example.servicioatencioncliente.controller;

import com.example.servicioatencioncliente.model.Ticket;
import com.example.servicioatencioncliente.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketService.createTicket(ticket);
    }

    @GetMapping
    public List<Ticket> getAllTickets() {
        return ticketService.getAllTickets();
    }

    @PutMapping("/{id}")
    public Ticket updateTicketStatus(@PathVariable Long id, @RequestParam String status) {
        return ticketService.updateTicketStatus(id, status);
    }
}
