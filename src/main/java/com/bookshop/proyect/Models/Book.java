package com.bookshop.proyect.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import lombok.Data;

@Data
@Entity
@Table(name = "book")
public class Book {

    @Id // esta es la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //asignar valor unico a cada registro nuevo en la database
    private int id;
    @NotNull
    @NotBlank
    private String title;
    private String description;
    private String category;
    private Double price;
    private String isbn;
    private int pages;
    private LocalDate publication_date;

    @ManyToOne //Muchos a uno
    @JoinColumn(name = "id_author") //la column id_author va hacer la foreign key para relacionarse con la tabla autores
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Author author;

}
