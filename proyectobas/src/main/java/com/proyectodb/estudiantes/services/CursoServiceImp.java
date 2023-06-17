package com.proyectodb.estudiantes.services;

import com.proyectodb.estudiantes.Dao.CursoDao;
import com.proyectodb.estudiantes.Entity.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImp implements CursoService {

    @Autowired
    private CursoDao cursoDao;
    @Override
    public List<Curso> findAll() {
        return (List<Curso>) cursoDao.findAll(); //Invoca al productoDao nos sirve para listar todos los productos
    }
    @Override
    public Curso findById(Long id) {

        return cursoDao.findById(id).orElse(null); // Tiene el método findbyId si no existe que devuelva lo que esta dentro del parentisis
    }


    @Override
    public void createCurso(Curso curso) {
        cursoDao.save(curso);

    }
    @Override
    public void modifyCurso(Long id, Curso curso) {
        if (cursoDao.existsById(id)) {
            curso.setId(id);
            cursoDao.save(curso);
        }
    }

    @Override
    public void deleteCurso(Long id) {
        if (cursoDao.existsById(id)) {
            cursoDao.deleteById(id);
        }
    }
}











// Tipo de dato que es el Id en este caso es Log
