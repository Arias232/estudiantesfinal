package com.proyectodb.estudiantes.controller;

import com.proyectodb.estudiantes.Entity.Estudiante;
import com.proyectodb.estudiantes.services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    @Autowired
    EstudianteService estudianteService;

    // Para consultas se utilizan los métodos GET
    @GetMapping
    public List<Estudiante> listarEstudiantes() {
        return estudianteService.findAll();
    }



    @GetMapping(value = "/{id}")
    public Estudiante obtenerEstudiante(@PathVariable Long id) {
        return estudianteService.findById(id);
    }


@PostMapping()
    public void crearEstudiante(@RequestBody Estudiante estudiante){
    estudianteService.createEstudiante(estudiante);
}


@PutMapping(value = "/{id}")
    public void modificarEstudiante(@PathVariable Long id, @RequestBody Estudiante estudiante){
    estudianteService.modifyEstudiante(id, estudiante);
}


@DeleteMapping(value = "/{id}")
    public void modificarEstudiante(@PathVariable Long id){
    estudianteService.deleteEstudiante(id);
}
}

