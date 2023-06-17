package com.proyectodb.estudiantes.services;

import com.proyectodb.estudiantes.Dao.CalificacionDao;
import com.proyectodb.estudiantes.Entity.Calificacion;
import com.proyectodb.estudiantes.Entity.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalificacionServiceImp implements CalificacionService {

    @Autowired
    private CalificacionDao calificacionDao;
    @Override
    public List<Calificacion> findAll() {
        return (List<Calificacion>) calificacionDao.findAll(); //Invoca al productoDao nos sirve para listar todos los productos
    }
    @Override
    public Calificacion findById(Long id) {

        return calificacionDao.findById(id).orElse(null); // Tiene el método findbyId si no existe que devuelva lo que esta dentro del parentisis
    }

    @Override
    public void createCalificacion(Calificacion calificacion) {
        calificacionDao.save(calificacion);

    }
    @Override
    public void modifyCalificacion(Long id, Calificacion calificacion) {
        if (calificacionDao.existsById(id)) {
            calificacion.setId(id);
            calificacionDao.save(calificacion);
        }
    }

    @Override
    public void deleteCalificacion(Long id) {
        if (calificacionDao.existsById(id)) {
            calificacionDao.deleteById(id);
        }
    }
}








// Tipo de dato que es el Id en este caso es Log
