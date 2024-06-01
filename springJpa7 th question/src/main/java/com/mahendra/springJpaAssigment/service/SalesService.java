package com.mahendra.springJpaAssigment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.mahendra.springJpaAssigment.entity.Product;
import com.mahendra.springJpaAssigment.entity.Sales;
import com.mahendra.springJpaAssigment.repo.salesRepo;

@Component
public class SalesService {
    @Autowired
    private salesRepo salesRepo;

    public void getAllSalesByProduct(int prodId){
        Product product =new Product();
        product.setProdId(prodId);
         List <Sales>  sale= salesRepo.findAllByProduct(product);

         for (Sales sales : sale) {
            System.out.println(sales);
            
         }

        }
   public  void  valuesBetween(int min , int max){
        
         List <Sales>  sale2= salesRepo.findAllByQtyBetween(min , max);

         for (Sales sales : sale2) {
            System.out.println(sales);
            
         }
    }

    // public Page<Sales> page(int pageNumber,int size){
    //     Sort sort=Sort.by("invNo");
    //     PageRequest pageable=PageRequest.of(pageNumber, size,sort);
    //     return salesRepo.findAll(pageable);
    // }

    public Page<Sales> sort(int pageNumber, int size) {
    Sort sort = Sort.by(Sort.Direction.DESC, "invNo");
    PageRequest pageable = PageRequest.of(pageNumber, size, sort);
    return salesRepo.findAll(pageable);
}





}
