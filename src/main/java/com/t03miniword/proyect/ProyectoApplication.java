package com.t03miniword.proyect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProyectoApplication {
    public static void main(String[] args) {
        // Iniciar la aplicación Spring Boot y obtener el contexto de la aplicación
        ConfigurableApplicationContext context = SpringApplication.run(ProyectoApplication.class, args);
        
        // Obtener el controlador desde el contexto de la aplicación
        Controlador controlador = context.getBean(Controlador.class);
        
        // Llamar al método obtenerMensaje del controlador para obtener el mensaje
        String mensaje = controlador.obtenerMensaje();
        
        // Imprimir el mensaje en la consola
        System.out.println("Mensaje obtenido: " + mensaje);
        
        // Cerrar el contexto de la aplicación cuando hayas terminado
        context.close();
    }
}
