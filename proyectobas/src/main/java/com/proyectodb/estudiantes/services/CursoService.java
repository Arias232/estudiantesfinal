package com.proyectodb.estudiantes.services;

import com.proyectodb.estudiantes.Entity.Curso;

import java.util.List;

public interface CursoService {
    public List<Curso> findAll();
    public Curso findById(Long id);
    public void createCurso(Curso curso);
    public void modifyCurso(Long id, Curso curso);
    public void deleteCurso(Long id);
}
