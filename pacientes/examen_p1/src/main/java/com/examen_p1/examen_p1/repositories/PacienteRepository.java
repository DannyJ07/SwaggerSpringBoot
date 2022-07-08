package com.examen_p1.examen_p1.repositories;

import com.examen_p1.examen_p1.models.Paciente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {

    
}
