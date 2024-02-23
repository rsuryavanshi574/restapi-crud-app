package com.restAPICRUD.service;

import com.restAPICRUD.entity.Book;

import java.util.List;

public interface BookService {

    public String upsert(Book book);

    public List<Book> getAllBook();

    public String deleteBook(Integer id);

}
