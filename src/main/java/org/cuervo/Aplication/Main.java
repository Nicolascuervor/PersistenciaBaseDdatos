package org.cuervo.Aplication;

import org.cuervo.Aplication.Services.CitaService;
import org.cuervo.Aplication.Services.DoctorService;
import org.cuervo.Aplication.Services.PacienteService;
import org.cuervo.Infraestructure.FileCitasRepository;
import org.cuervo.Infraestructure.FileDoctorRepository;
import org.cuervo.Infraestructure.FilePacienteRepository;
import org.cuervo.Interfaces.CitasRepository;
import org.cuervo.Interfaces.DoctorRepository;
import org.cuervo.Interfaces.PacienteRepository;

public class Main {
    public static void main(String[] args) {
        PacienteRepository repository = new FilePacienteRepository();
        PacienteService service = new PacienteService(repository);
        

        DoctorRepository doctorRepository = new FileDoctorRepository();
        DoctorService service2 = new DoctorService(doctorRepository);

        CitasRepository citasRepository = new FileCitasRepository();
        CitaService service3 = new CitaService(citasRepository);


        Visual visual = new Visual(service,service2,service3);

        visual.iniciar();


    }
}
