package com.t03miniword.proyect;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Servicio {
    private final Mensaje mensaje;

    // Constructor para la inyección de dependencia
    public Servicio(Mensaje mensaje) {
        this.mensaje = mensaje;
    }

    public String obtenerMensaje() {
        return mensaje.getContenido();
    }
}

