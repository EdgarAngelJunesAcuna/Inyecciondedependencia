package com.t03miniword.proyect;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controlador {
    private final Servicio servicio;

    // Constructor para la inyección de dependencia
    public Controlador(Servicio servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/mensaje")
    public String obtenerMensaje() {
        return servicio.obtenerMensaje();
    }
}

