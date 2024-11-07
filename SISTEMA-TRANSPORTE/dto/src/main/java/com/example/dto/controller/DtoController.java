package com.example.dto.controller;

import com.example.dto.UserDTO;
import com.example.dto.ConductorDTO;
import com.example.dto.ReservaDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;  // Asegúrate de importar java.util.Date

@RestController
public class DtoController {

    @GetMapping("/user")
    public UserDTO getUser() {
        // Retornar un objeto UserDTO de ejemplo
        return new UserDTO(1L, "Mariel", "admin");
    }

    @GetMapping("/conductor")
    public ConductorDTO getConductor() {
        // Retornar un objeto ConductorDTO de ejemplo
        return new ConductorDTO(1L, "Jean Pierre", "0512");
    }

    @GetMapping("/reserva")
    public ReservaDTO getReserva() {
        // Retornar un objeto ReservaDTO de ejemplo
        return new ReservaDTO(1L, 1L, 101L, new Date(), "confirmada");
    }
}
