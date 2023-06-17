package com.proyectodb.estudiantes.services;

import com.proyectodb.estudiantes.Dao.EstudianteDao;
import com.proyectodb.estudiantes.Entity.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstudianteServiceImp implements EstudianteService {

    @Autowired
    private EstudianteDao estudianteDao;
    @Override
    public List<Estudiante> findAll() {
        return (List<Estudiante>) estudianteDao.findAll(); //Invoca al productoDao nos sirve para listar todos los productos
    }
    @Override
    public Estudiante findById(Long id) {

        return estudianteDao.findById(id).orElse(null); // Tiene el método findbyId si no existe que devuelva lo que esta dentro del parentisis
    }









    @Override
    public void createEstudiante(Estudiante estudiante) {
        estudianteDao.save(estudiante);

    }
    @Override
    public void modifyEstudiante(Long id, Estudiante estudiante) {
        if (estudianteDao.existsById(id)) {
            estudiante.setId(id);
            estudianteDao.save(estudiante);
        }
    }

    @Override
    public void deleteEstudiante(Long id) {
        if (estudianteDao.existsById(id)) {
            estudianteDao.deleteById(id);
        }
    }
}











// Tipo de dato que es el Id en este caso es Log
