package com.example.myinheritancedemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyInheritanceDemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MyInheritanceDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
