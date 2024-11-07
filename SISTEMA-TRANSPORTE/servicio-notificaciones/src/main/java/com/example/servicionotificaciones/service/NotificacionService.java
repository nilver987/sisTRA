package com.example.servicionotificaciones.model.notificaciones.service;

import com.example.servicionotificaciones.model.notificaciones.model.Notificacion;
import com.example.servicionotificaciones.model.notificaciones.repository.NotificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class NotificacionService {

    @Autowired
    private NotificacionRepository notificacionRepository;

    @Autowired
    private JavaMailSender mailSender;

    // Método para enviar correo electrónico
    public void enviarNotificacionCorreo(String destinatario, String mensaje) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(destinatario);
        message.setSubject("Notificación de Transporte");
        message.setText(mensaje);
        mailSender.send(message);
    }

    // Método para guardar la notificación en la base de datos
    public Notificacion crearNotificacion(Long clienteId, String mensaje, String tipo) {
        Notificacion notificacion = new Notificacion(clienteId, mensaje, tipo, false, new Date());
        return notificacionRepository.save(notificacion);
    }
}
