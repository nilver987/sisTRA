package com.example.serviciohorarios.repository;

import com.transporte.serviciohorarios.model.Horario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HorarioRepository extends JpaRepository<Horario, Long> {
    List<Horario> findByRutaId(Long rutaId);
    List<Horario> findByBusId(Long busId);
}
