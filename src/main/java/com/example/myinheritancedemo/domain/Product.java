package com.example.myinheritancedemo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private Integer id;

    private Integer productNumber;
    private String name;
    private Double price;
}
