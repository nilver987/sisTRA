package com.example.serviciohorarios.service;

import com.transporte.serviciohorarios.model.Horario;
import com.example.serviciohorarios.repository.HorarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HorarioService {
    @Autowired
    private HorarioRepository horarioRepository;

    public List<Horario> getAllHorarios() {
        return horarioRepository.findAll();
    }

    public List<Horario> getHorariosByRutaId(Long rutaId) {
        return horarioRepository.findByRutaId(rutaId);
    }

    public List<Horario> getHorariosByBusId(Long busId) {
        return horarioRepository.findByBusId(busId);
    }

    public Horario saveHorario(Horario horario) {
        return horarioRepository.save(horario);
    }
}
