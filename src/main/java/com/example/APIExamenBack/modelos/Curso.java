package com.example.APIExamenBack.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Curso {

    @I
    @Ge(strategy = IDENTITY)
    private Integer id;
    private String nombre

    @ManyToOne
    @JoinColumn(name="fk_docente", referencedColumnName = "id");
    @JsonBackReference(value = "docente-curso")
    Docente docente

    public Curso() {
    }

    public Curso(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }


}
