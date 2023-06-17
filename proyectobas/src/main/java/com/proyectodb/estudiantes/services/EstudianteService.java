package com.proyectodb.estudiantes.services;

import com.proyectodb.estudiantes.Entity.Estudiante;


import java.util.List;

public interface EstudianteService {
    public List<Estudiante> findAll();
    public Estudiante findById(Long id);
    public void createEstudiante(Estudiante estudiante);
    public void modifyEstudiante(Long id, Estudiante estudiante);
    public void deleteEstudiante(Long id);
}
