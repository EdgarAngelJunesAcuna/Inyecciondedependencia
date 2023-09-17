package com.t03miniword.proyect;

public class MensajeImpl implements Mensaje {
    @Override
    public String getContenido() {
        return "¡Hola desde el servicio de mensajes!";
    }
}