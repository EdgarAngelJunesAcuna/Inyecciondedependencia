package com.t03miniword.proyect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguracionSpring {
    @Bean
    public Mensaje mensaje() {
        return new MensajeImpl();
    }
}
