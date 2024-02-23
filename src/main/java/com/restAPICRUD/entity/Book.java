package com.restAPICRUD.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "BookDetails")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;
    private String bookName;
    private Double bookPrice;


}
