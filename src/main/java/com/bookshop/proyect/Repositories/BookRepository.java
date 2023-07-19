package com.bookshop.proyect.Repositories;

import com.bookshop.proyect.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
