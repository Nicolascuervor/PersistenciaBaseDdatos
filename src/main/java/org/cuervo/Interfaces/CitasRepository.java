package org.cuervo.Interfaces;

import org.cuervo.Domain.Cita;


import java.util.List;

public interface CitasRepository {
    void saveCita(Cita cita);
    void updateCita(Cita cita);

    void deleteCita(int id);

    Cita findCitaById(int id);
    List<Cita> findAll();
}
