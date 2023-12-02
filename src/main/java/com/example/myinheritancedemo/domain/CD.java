package com.example.myinheritancedemo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CD extends Product {
    @Id
    @GeneratedValue
    private Integer id;

    public CD(String artist) {
        this.artist = artist;
    }

    private String artist;


    public CD() {

    }
}
