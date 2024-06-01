package com.mahendra.springJpaAssigment.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.mahendra.springJpaAssigment.entity.Product;
import com.mahendra.springJpaAssigment.entity.Sales;

@Component

public interface salesRepo extends JpaRepository<Sales,Long>  {
    public List<Sales> findAllByProduct(Product product);

    public List<Sales> findAllByQtyBetween(int min , int max);

    
}

