package com.examen_p1.examen_p1.services;

import java.util.List;

import com.examen_p1.examen_p1.dto.NuevoPacienteDTO;
import com.examen_p1.examen_p1.dto.PacienteDTO;

public interface PacienteService {

    public PacienteDTO create(NuevoPacienteDTO pacienteDTO);
    public PacienteDTO retrieve(Long id);
    public PacienteDTO update(PacienteDTO pacienteDTO, Long id);
    public void delete(Long id);

    public List<PacienteDTO> list();
    
}
