package com.example.serviciohorarios.controller;

import com.transporte.serviciohorarios.model.Horario;
import com.example.serviciohorarios.service.HorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/horarios")
public class HorarioController {
    @Autowired
    private HorarioService horarioService;

    @GetMapping
    public List<Horario> getAllHorarios() {
        return horarioService.getAllHorarios();
    }

    @GetMapping("/ruta/{rutaId}")
    public List<Horario> getHorariosByRutaId(@PathVariable Long rutaId) {
        return horarioService.getHorariosByRutaId(rutaId);
    }

    @GetMapping("/bus/{busId}")
    public List<Horario> getHorariosByBusId(@PathVariable Long busId) {
        return horarioService.getHorariosByBusId(busId);
    }

    @PostMapping
    public Horario saveHorario(@RequestBody Horario horario) {
        return horarioService.saveHorario(horario);
    }
}
