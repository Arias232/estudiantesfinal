package com.proyectodb.estudiantes.services;

import com.proyectodb.estudiantes.Entity.Calificacion;
import com.proyectodb.estudiantes.Entity.Curso;

import java.util.List;

public interface CalificacionService {
    public List<Calificacion> findAll();
    public Calificacion findById(Long id);
    public void createCalificacion(Calificacion calificacion);
    public void modifyCalificacion(Long id, Calificacion calificacion);
    public void deleteCalificacion(Long id);
}
