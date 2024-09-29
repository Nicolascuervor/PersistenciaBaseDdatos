package org.cuervo.Aplication.Services;


import org.cuervo.Domain.Paciente;
import org.cuervo.Interfaces.PacienteRepository;

import java.util.List;

public class PacienteService {

    private final PacienteRepository repository;

    public PacienteService(PacienteRepository repository) {
        this.repository = repository;
    }


    public void crear(Paciente paciente) {
        repository.save(paciente);
    }

    public List<Paciente> listarPacientes() {
        return repository.findAll();
    }

    public void eliminarPaciente(int id) {
        repository.delete(id);
    }

    public Paciente buscarPacientePorId(int id) {
       return repository.findById(id);
    }

    public void actualizarPaciente(Paciente paciente) {
        repository.update(paciente);
    }

}
