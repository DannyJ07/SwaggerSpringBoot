package com.examen_p1.examen_p1.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.examen_p1.examen_p1.dto.NuevoPacienteDTO;
import com.examen_p1.examen_p1.dto.PacienteDTO;
import com.examen_p1.examen_p1.exceptions.ResourceNotFoundException;
import com.examen_p1.examen_p1.models.Paciente;
import com.examen_p1.examen_p1.repositories.PacienteRepository;
import com.examen_p1.examen_p1.services.PacienteService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PacienteServiceImpl implements PacienteService{

    final ModelMapper modelMapper;
    final PacienteRepository pacienteRepository;

    @Autowired
    public PacienteServiceImpl(@Autowired PacienteRepository repository, ModelMapper mapper){
        
        this.modelMapper = mapper;
        this.pacienteRepository = repository;
    }

    @Override
    @Transactional
    public PacienteDTO create(NuevoPacienteDTO pacienteDTO) {
        Paciente paciente = modelMapper.map(pacienteDTO, Paciente.class);
        pacienteRepository.save(paciente);
        return modelMapper.map(paciente, PacienteDTO.class);

    }
    @Override
    @Transactional(readOnly = true)
    public PacienteDTO retrieve(Long id) {
        Paciente paciente = pacienteRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Paciente no encontrado"));
        return modelMapper.map(paciente, PacienteDTO.class);
    }
    @Override
    @Transactional
    public PacienteDTO update(PacienteDTO pacienteDTO, Long id) {
        Paciente paciente = pacienteRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Paciente no encontrado"));
        paciente.setId(id);
        paciente = modelMapper.map(pacienteDTO, Paciente.class);
        pacienteRepository.save(paciente);
        
        return modelMapper.map(paciente, PacienteDTO.class);
    }
    @Override
    @Transactional
    public void delete(Long id) {
        Paciente paciente = pacienteRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Paciente no encontrado"));
        pacienteRepository.deleteById(paciente.getId());
        
    }
    @Override
    public List<PacienteDTO> list() {
        
        List<Paciente> pacientes = pacienteRepository.findAll();
        return pacientes.stream().map(paciente -> modelMapper.map(paciente, PacienteDTO.class)).collect(Collectors.toList());
    }
    
}
