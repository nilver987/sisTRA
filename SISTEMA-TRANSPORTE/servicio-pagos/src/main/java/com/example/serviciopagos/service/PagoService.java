package com.example.serviciopagos.model.pagos.service;

import com.example.serviciopagos.model.pagos.model.Pago;
import com.example.serviciopagos.model.pagos.repository.PagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagoService {

    @Autowired
    private PagoRepository pagoRepository;

    public Pago registrarPago(Pago pago) {
        return pagoRepository.save(pago);
    }

    public List<Pago> obtenerPagos() {
        return pagoRepository.findAll();
    }

    public Pago obtenerPagoPorId(Long id) {
        return pagoRepository.findById(id).orElse(null);
    }

    public void eliminarPago(Long id) {
        pagoRepository.deleteById(id);
    }
}
