package com.example.servicionotificaciones.model.notificaciones.controller;

import com.example.servicionotificaciones.model.notificaciones.model.Notificacion;
import com.example.servicionotificaciones.model.notificaciones.service.NotificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notificaciones")
public class NotificacionController {

    @Autowired
    private NotificacionService notificacionService;

    @PostMapping("/correo")
    public void enviarNotificacionCorreo(@RequestParam String destinatario, @RequestParam String mensaje) {
        notificacionService.enviarNotificacionCorreo(destinatario, mensaje);
    }

    @PostMapping
    public com.example.notificaciones.model.Notificacion crearNotificacion(@RequestBody Notificacion notificacion) {
        return notificacionService.crearNotificacion(notificacion.getClienteId(), notificacion.getMensaje(), notificacion.getTipo());
    }

    @GetMapping
    public List<com.example.notificaciones.model.Notificacion> obtenerNotificaciones() {
        return notificacionService.obtenerNotificaciones();
    }
}
