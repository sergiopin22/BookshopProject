package com.bookshop.proyect.Services;

import com.bookshop.proyect.Models.Author;
import com.bookshop.proyect.Repositories.AuthorRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired //inyectamos
    AuthorRepository authorRepo;
    
    
    @Override
    public Author save(Author author) {
        return authorRepo.save(author);
    }

    @Override
    public List<Author> getAllAuthors() {
        return authorRepo.findAll();
    }

    @Override
    public void delete(int id) {
        authorRepo.deleteById(id);
    }

    @Override
    public Optional<Author> getAuthorById(int id) {
        return authorRepo.findById(id);
    }

    
    
}
