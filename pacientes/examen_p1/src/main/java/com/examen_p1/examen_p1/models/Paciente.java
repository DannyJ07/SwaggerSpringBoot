package com.examen_p1.examen_p1.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="TBL_PACIENTES")
@Getter
@Setter
public class Paciente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NOMBRE")  
    private String nombre;

    @Column(name = "ESTATURA")  
    private float estatura;

    @Column(name = "PESO")  
    private float peso;

    @Column(name = "FECHA_INGRESO")  
    private String fecha_ing;

    @Column(name = "EDAD")  
    private Integer edad;
}
