package com.proyectodb.estudiantes.Entity;
import javax.persistence.*;
import java.util.Date;



    @Entity // objeto se convierte en una base de datos
    @Table(name = "estudiantes") //Nombre de nuestra base de datos
    public class Estudiante {

        @Id // Valor único para identificar objeto.
        @GeneratedValue(strategy = GenerationType.IDENTITY) // Campo se genera automaticamente
        private long id;
        private String name;
        private String email;
        private String carnet;
        private Double average;
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

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getCarnet() {
            return carnet;
        }

        public void setCarnet(String carnet) {
            this.carnet = carnet;
        }

        public Double getAverage() {
            return average;
        }

        public void setAverage(Double average) {
            this.average = average;
        }

        public Date getCreateAt() {
            return createAt;
        }

        public void setCreateAt(Date createAt) {
            this.createAt = createAt;
        }
    }


