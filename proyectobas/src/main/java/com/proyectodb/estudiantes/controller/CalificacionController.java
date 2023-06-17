package com.proyectodb.estudiantes.controller;


import com.proyectodb.estudiantes.Entity.Calificacion;

import com.proyectodb.estudiantes.services.CalificacionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calificaciones")
public class CalificacionController {

    @Autowired
    CalificacionService calificacionService;

    // Para consultas se utilizan los métodos GET
    @GetMapping
    public List<Calificacion> listarCalificaciones() {
        return calificacionService.findAll();
    }



    @GetMapping(value = "/{id}")
    public Calificacion obtenerCalificaciones(@PathVariable Long id) {
        return calificacionService.findById(id);
    }


    @PostMapping()
    public void crearCalificaciones(@RequestBody Calificacion calificaciones){
        calificacionService.createCalificacion(calificaciones);
    }


    @PutMapping(value = "/{id}")
    public void modificarCalificaciones(@PathVariable Long id, @RequestBody Calificacion calificaciones){
        calificacionService.modifyCalificacion(id, calificaciones);
    }


    @DeleteMapping(value = "/{id}")
    public void modificarCalificacion(@PathVariable Long id){
        calificacionService.deleteCalificacion(id);
    }
}

