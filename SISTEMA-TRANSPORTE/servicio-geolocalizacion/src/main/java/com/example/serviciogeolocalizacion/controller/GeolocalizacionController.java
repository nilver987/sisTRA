package com.example.serviciogeolocalizacion.controller;

import com.example.serviciogeolocalizacion.model.Ubicacion;
import com.example.serviciogeolocalizacion.service.GeolocalizacionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/geolocalizacion")
public class GeolocalizacionController {

    private final GeolocalizacionService geolocalizacionService;

    public GeolocalizacionController(GeolocalizacionService geolocalizacionService) {
        this.geolocalizacionService = geolocalizacionService;
    }

    @GetMapping("/{idConductor}")
    public ResponseEntity<Ubicacion> obtenerUbicacion(@PathVariable Long idConductor) {
        Ubicacion ubicacion = geolocalizacionService.obtenerUbicacion(idConductor);
        return ResponseEntity.ok(ubicacion);
    }

    @PostMapping
    public ResponseEntity<Ubicacion> actualizarUbicacion(@RequestBody Ubicacion ubicacion) {
        geolocalizacionService.actualizarUbicacion(ubicacion);
        return ResponseEntity.noContent().build();
    }
}
