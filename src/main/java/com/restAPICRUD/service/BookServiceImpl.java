package com.restAPICRUD.service;

import com.restAPICRUD.entity.Book;
import com.restAPICRUD.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public String upsert(Book book) {

        Integer bookId = book.getBookId();

        System.out.println(book);
        bookRepository.save(book);
        System.out.println(book);

        if(bookId == null){
            return "Book is Inserted";
        }else {
           return "Book is Updated";
        }

    }

    @Override
    public List<Book> getAllBook() {

        List bookList = bookRepository.findAll();
        return bookList;
    }

    @Override
    public String deleteBook(Integer id) {

        bookRepository.deleteById(id);
        return "Book deleted";
    }
}
