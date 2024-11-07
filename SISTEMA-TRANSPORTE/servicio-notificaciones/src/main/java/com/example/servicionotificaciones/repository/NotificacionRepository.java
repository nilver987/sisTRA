package com.example.servicionotificaciones.model.notificaciones.repository;

import com.example.servicionotificaciones.model.Notificacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificacionRepository extends JpaRepository<Notificacion, Long>

}
