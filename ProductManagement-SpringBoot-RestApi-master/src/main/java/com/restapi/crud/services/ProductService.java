package com.restapi.crud.services;

import com.restapi.crud.entity.Product;
import com.restapi.crud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;


    //    save : one
    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    //    save  : all list
    public List<Product> saveProducts(List<Product> products) {
        return repository.saveAll(products);
    }


    //      find all data :
    public List<Product> getProducts() {
        return repository.findAll();
    }

    //    fetch data by id
    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    //    fetch data by id
    public Product getProductByName(String name) {
        return repository.findByName(name);
    }

    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "product removed  || " + id;

    }

//    public Product updateProduct(Product product) {
//        Product existingProduct = repository.findById(product.getId()).orElse(null);
//        existingProduct.setName(product.getName());
//        existingProduct.setQuantity(product.getQuantity());
//        existingProduct.setPrice(product.getPrice());
//
//        return repository.save(existingProduct);
//    }

}
