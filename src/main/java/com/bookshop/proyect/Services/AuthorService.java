package com.bookshop.proyect.Services;

import com.bookshop.proyect.Models.Author;
import java.util.List;
import java.util.Optional;

public interface AuthorService {

    Author save(Author author);// guardar autores o actualizarlos

    List<Author> getAllAuthors();//obtener todos los autores

    void delete(int id); // eliminar authores por id

    Optional<Author> getAuthorById(int id); //obtener author por id
    
}
