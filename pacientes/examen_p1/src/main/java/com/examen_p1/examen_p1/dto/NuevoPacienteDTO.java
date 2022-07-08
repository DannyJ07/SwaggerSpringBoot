package com.examen_p1.examen_p1.dto;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class NuevoPacienteDTO {

    @NotNull(message = "El campo nomnbre no puede estar vacio")
    private String nombre;
    @NotNull(message = "El campo de estatura no puede estar vacio.")
    private float estatura;
    @NotNull(message = "El campo de peso no puede estar vacio.")
    private float peso;
    @NotNull(message = "El campo de fecha no puede estar vacio.")
    private String fecha_ing;
    @NotNull(message = "El campo de edad no puede estar vacio.")
    private Integer edad;

    
}
