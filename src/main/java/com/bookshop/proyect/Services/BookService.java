package com.bookshop.proyect.Services;

import com.bookshop.proyect.Models.Book;
import java.util.List;
import java.util.Optional;

public interface BookService {

    Book save(Book book);// guardar book o actualizarlos

    List<Book> getAllBooks();//obtener todos los books

    void delete(int id); // eliminar books por id

    Optional<Book> getBookById(int id); //obtener book por id
}
