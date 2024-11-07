package com.example.serviciobuses.controller;

import com.example.serviciobuses.model.Bus;
import com.example.serviciobuses.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/buses")
public class BusController {
    @Autowired
    private BusService busService;

    @GetMapping
    public List<Bus> getAllBuses() {
        return busService.getAllBuses();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bus> getBusById(@PathVariable Long id) {
        return busService.getBusById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Bus saveBus(@RequestBody Bus bus) {
        return busService.saveBus(bus);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBus(@PathVariable Long id) {
        busService.deleteBus(id);
        return ResponseEntity.noContent().build();
    }
}
