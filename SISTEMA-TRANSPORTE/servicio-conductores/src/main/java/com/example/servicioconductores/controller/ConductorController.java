package com.example.servicioconductores.controller;

import com.example.servicioconductores.model.Conductor;
import com.example.servicioconductores.service.ConductorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conductores")
public class ConductorController {

    private final ConductorService conductorService;

    public ConductorController(ConductorService conductorService) {
        this.conductorService = conductorService;
    }

    @GetMapping
    public List<Conductor> listarConductores() {
        return conductorService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Conductor> obtenerConductor(@PathVariable Long id) {
        return conductorService.obtenerPorId(id)
                .map(conductor -> ResponseEntity.ok(conductor))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Conductor> crearConductor(@RequestBody Conductor conductor) {
        Conductor nuevoConductor = conductorService.guardar(conductor);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoConductor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarConductor(@PathVariable Long id) {
        conductorService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
