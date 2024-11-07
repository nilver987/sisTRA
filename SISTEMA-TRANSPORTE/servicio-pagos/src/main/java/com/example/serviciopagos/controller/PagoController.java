package com.example.serviciopagos.model.pagos.controller;

import com.example.serviciopagos.model.pagos.model.Pago;
import com.example.serviciopagos.model.pagos.service.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pagos")
public class PagoController {

    @Autowired
    private PagoService pagoService;

    @PostMapping
    public Pago registrarPago(@RequestBody Pago pago) {
        return pagoService.registrarPago(pago);
    }

    @GetMapping
    public List<Pago> obtenerPagos() {
        return pagoService.obtenerPagos();
    }

    @GetMapping("/{id}")
    public Pago obtenerPagoPorId(@PathVariable Long id) {
        return pagoService.obtenerPagoPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarPago(@PathVariable Long id) {
        pagoService.eliminarPago(id);
    }
}
