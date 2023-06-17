package com.proyectodb.estudiantes.Entity;
import javax.persistence.*;
import java.util.Date;


@Entity // objeto se convierte en una base de datos
@Table(name = "cursos") //Nombre de nuestra base de datos
public class Curso {

    @Id // Valor único para identificar objeto.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Campo se genera automaticamente
    private long id;
    private String name;


    @Column(name = "create_at") // Cambiar nombre de atributo
    @Temporal(TemporalType.DATE) // Atributo sea tratado como una fecha sin error
    private Date createAt;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}

