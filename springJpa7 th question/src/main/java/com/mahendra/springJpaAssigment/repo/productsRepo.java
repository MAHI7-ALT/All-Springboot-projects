package com.mahendra.springJpaAssigment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.mahendra.springJpaAssigment.entity.Product;


@Component
public interface productsRepo extends JpaRepository<Product,Integer>  {

    
}

