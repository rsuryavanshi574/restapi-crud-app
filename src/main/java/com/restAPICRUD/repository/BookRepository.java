package com.restAPICRUD.repository;

import com.restAPICRUD.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface BookRepository extends JpaRepository<Book, Serializable> {
}
