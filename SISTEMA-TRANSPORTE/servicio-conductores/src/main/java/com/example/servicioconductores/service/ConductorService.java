package com.example.servicioconductores.service;

import com.example.servicioconductores.model.Conductor;
import com.example.servicioconductores.repository.ConductorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConductorService {

    private final ConductorRepository conductorRepository;

    public ConductorService(ConductorRepository conductorRepository) {
        this.conductorRepository = conductorRepository;
    }

    public List<Conductor> listarTodos() {
        return conductorRepository.findAll();
    }

    public Optional<Conductor> obtenerPorId(Long id) {
        return conductorRepository.findById(id);
    }

    public Conductor guardar(Conductor conductor) {
        return conductorRepository.save(conductor);
    }

    public void eliminar(Long id) {
        conductorRepository.deleteById(id);
    }
}
