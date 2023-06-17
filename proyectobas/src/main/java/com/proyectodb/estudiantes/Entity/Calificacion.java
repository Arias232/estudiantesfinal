package com.proyectodb.estudiantes.Entity;
import javax.persistence.*;
import java.util.Date;


@Entity // objeto se convierte en una base de datos
@Table(name = "Calificaciones") //Nombre de nuestra base de datos
public class Calificacion {


    @Id
    private Long id;
    private int nota;


    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

