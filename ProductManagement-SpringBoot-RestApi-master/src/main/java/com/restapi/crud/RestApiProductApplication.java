package com.restapi.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.restapi.crud.entity.Product;
import com.restapi.crud.repository.ProductRepository;

@SpringBootApplication
public class RestApiProductApplication implements CommandLineRunner {

    @Autowired
    private ProductRepository repository;

    public static void main(String[] args) {

        System.out.println("Started...");
        SpringApplication.run(RestApiProductApplication.class, args);
       
    }

    // there we can add data to my app :
    @Override
    public void run(String... args) throws Exception {
        // data inserting :-
       Product product1 = new Product(1, "Earphone", 10, 4000);
        repository.save(product1);
       // Product product2 = new Product(2, "Mobile", 3, 67000);
        // repository.save(product2);
        // Product product3 = new Product(3, "Charger", 5, 3000);
        // repository.save(product3);


        System.out.println("Student Updated...");
    }
}
