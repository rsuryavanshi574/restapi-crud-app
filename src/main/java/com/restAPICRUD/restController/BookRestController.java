package com.restAPICRUD.restController;

import com.restAPICRUD.entity.Book;
import com.restAPICRUD.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookRestController {
    
    @Autowired
    BookService service;
    
    @PostMapping("/book")
    public ResponseEntity<String> addBook(@RequestBody Book book){
        String msg = service.upsert(book);

        return new ResponseEntity<>(msg, HttpStatus.CREATED);
    }

    @GetMapping("/book")
    public ResponseEntity<List<Book>> getAllBook(){
        List<Book> allBook = service.getAllBook();

        return new ResponseEntity<>(allBook, HttpStatus.OK);
    }

    @PutMapping("/book")
    public ResponseEntity<String> updateBook(@RequestBody Book book){
        String msg = service.upsert(book);

        return new ResponseEntity<>(msg, HttpStatus.CREATED);
    }

    @DeleteMapping("/book/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable Integer id){
        String msg = service.deleteBook(id);

        return new ResponseEntity<>(msg, HttpStatus.OK);
    }
}
