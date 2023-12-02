package com.example.myinheritancedemo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Book extends Product{
    @Id
    @GeneratedValue
    private Integer id;

    public Book(String isbn) {
        this.isbn = isbn;
    }

    private String isbn;

    public Book() {

    }
}
