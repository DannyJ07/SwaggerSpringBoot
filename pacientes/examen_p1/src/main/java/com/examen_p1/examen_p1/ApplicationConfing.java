package com.examen_p1.examen_p1;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Para mappear DTO con Entidades
@Configuration
public class ApplicationConfing {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }    
}
