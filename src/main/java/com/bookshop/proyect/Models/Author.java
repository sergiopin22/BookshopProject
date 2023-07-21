package com.bookshop.proyect.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import lombok.Data;

@Data //para importar lombok y ahorrarnos codigo con los metodos get and set
@Entity //esto es una entidad
@Table(name = "author")//asociamos la tabla con la entidad de la base de datos
public class Author {
    @Id//Llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @NotBlank
    private String name;
    
    @Column(name = "lastname")
    private String lastname;
    private String nationality;

    @OneToMany
    @JoinColumn(name = "id_author", referencedColumnName = "id") //aca hacemos el binding o vinculacion a la otra tabla
    List<Book> books;

    //metodos
    
    
}
