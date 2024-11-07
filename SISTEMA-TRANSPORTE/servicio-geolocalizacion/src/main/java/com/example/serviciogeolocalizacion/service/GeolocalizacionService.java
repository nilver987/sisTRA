package com.example.serviciogeolocalizacion.service;

import com.example.serviciogeolocalizacion.model.Ubicacion;
import com.example.serviciogeolocalizacion.repository.UbicacionRepository;
import com.google.maps.GeoApiContext;
import com.google.maps.model.GeolocationRequest;
import com.google.maps.model.LatLng;
import org.springframework.stereotype.Service;

@Service
public class GeolocalizacionService {

    private final UbicacionRepository ubicacionRepository;
    private final GeoApiContext geoApiContext;

    public GeolocalizacionService(UbicacionRepository ubicacionRepository, String googleMapsApiKey) {
        this.ubicacionRepository = ubicacionRepository;
        this.geoApiContext = new GeoApiContext.Builder()
                .apiKey(googleMapsApiKey)
                .build();
    }

    public Ubicacion obtenerUbicacion(Long idConductor) {
        // Lógica para obtener la ubicación desde la API de Google Maps
        // Aquí podríamos utilizar un servicio de geolocalización real, por ejemplo, obteniendo coordenadas GPS.
        LatLng coordenadas = obtenerCoordenadas(idConductor);
        Ubicacion ubicacion = new Ubicacion();
        ubicacion.setLatitud(coordenadas.lat);
        ubicacion.setLongitud(coordenadas.lng);
        ubicacion.setIdConductor(idConductor);
        return ubicacionRepository.save(ubicacion);
    }

    private LatLng obtenerCoordenadas(Long idConductor) {
        // Simulación de la obtención de coordenadas de un conductor
        return new LatLng(40.7128, -74.0060);  // Por ejemplo, coordenadas de Nueva York
    }

    public void actualizarUbicacion(Ubicacion ubicacion) {
        ubicacionRepository.save(ubicacion);
    }
}
