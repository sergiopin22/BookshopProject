
package com.bookshop.proyect.Controllers;

import com.bookshop.proyect.Models.Author;
import com.bookshop.proyect.Services.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/author")
public class AuthorController {
    
    @Autowired
    AuthorServiceImpl authorServ;
    
    @PostMapping("/save")
    public ResponseEntity<Author> saveAuthor(@RequestBody Author author){
        Author authorSaved = authorServ.save(author);
        return ResponseEntity.status(HttpStatus.CREATED).body(authorSaved);
    }
    
    
}
