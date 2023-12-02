package com.example.myinheritancedemo.domain;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Product {
    @Id
    @GeneratedValue
    private Integer id;

    private Integer productNumber;
    private String name;
    private Double price;
}
