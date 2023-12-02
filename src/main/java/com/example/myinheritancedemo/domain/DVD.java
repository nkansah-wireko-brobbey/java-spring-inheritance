package com.example.myinheritancedemo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class DVD extends Product {
    @Id
    @GeneratedValue
    private Integer id;

    public DVD(String genre) {
        this.genre = genre;
    }

    private String genre;


    public DVD() {

    }
}
