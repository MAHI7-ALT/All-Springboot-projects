package com.mahendra.springJpaAssigment.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mahendra.springJpaAssigment.entity.Product;
import com.mahendra.springJpaAssigment.repo.productsRepo;
import com.mahendra.springJpaAssigment.repo.salesRepo;

@Component
public class productService {

    @Autowired
    private productsRepo productRepo;

    @SuppressWarnings("unused")
    @Autowired
    private salesRepo salesRepo;

    public void insertElement(){
        Set<Product> products = new HashSet<>();
          Product product = new Product(); // Assuming a constructor with these parameters
           products.add(product);
productRepo.save(product);
        System.err.println(product);
                
    }
    public  void retrieve(){
        
    }

    
}
