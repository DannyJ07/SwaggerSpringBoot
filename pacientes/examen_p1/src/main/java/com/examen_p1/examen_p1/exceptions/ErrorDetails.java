package com.examen_p1.examen_p1.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class ErrorDetails {

    private String message;
    private String details; 
    
}