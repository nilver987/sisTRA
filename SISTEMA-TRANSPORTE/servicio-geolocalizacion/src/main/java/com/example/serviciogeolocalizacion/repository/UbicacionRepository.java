package com.example.serviciogeolocalizacion.repository;

import com.example.serviciogeolocalizacion.model.Ubicacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UbicacionRepository extends JpaRepository<Ubicacion, Long> {
}
