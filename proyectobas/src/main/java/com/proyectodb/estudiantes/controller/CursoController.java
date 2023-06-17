package com.proyectodb.estudiantes.controller;


import com.proyectodb.estudiantes.Entity.Curso;
import com.proyectodb.estudiantes.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    CursoService cursoService;

    // Para consultas se utilizan los métodos GET
    @GetMapping
    public List<Curso> listarCursos() {
        return cursoService.findAll();
    }



    @GetMapping(value = "/{id}")
    public Curso obtenerCursos(@PathVariable Long id) {
        return cursoService.findById(id);
    }


@PostMapping()
    public void crearCursos(@RequestBody Curso cursos){
    cursoService.createCurso(cursos);
}


@PutMapping(value = "/{id}")
    public void modificarCursos(@PathVariable Long id, @RequestBody Curso cursos){
    cursoService.modifyCurso(id, cursos);
}


@DeleteMapping(value = "/{id}")
    public void deleteCursos(@PathVariable Long id){
    cursoService.deleteCurso(id);
}
}
