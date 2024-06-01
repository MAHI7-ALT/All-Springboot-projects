package com.restapi.crud.controller;

import com.restapi.crud.entity.Product;
import com.restapi.crud.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    //     Handler methods to handle request like, :Student List, return mode and view also.

    //    add product
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> adProducts(@RequestBody List<Product> products) {
        return productService.saveProducts(products);
    }

    //    Home :
    @GetMapping("/")
    public String home() {
        return "This is product Management Project";
    }

    @GetMapping("/products")
    public List<Product> findAllProducts() {
        return productService.getProducts();
    }

    //    adding ui layer here :
   /* @GetMapping("/products")
    public String findAllProducts(Model model) {
        model.addAttribute("products ", productService.getProducts());
        return "products";
    }*/

    //    adding ui layer here :
  /*  @GetMapping("/ui")
    public String listStudents(Model model) {
        model.addAttribute("products ", productService.getProducts());
        return "products";
    }*/

    //      get product by id :
    @GetMapping("/products/{id}")
    public Product findProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

    @GetMapping("/product/{name}")
    public Product findProductByName(@PathVariable String name) {
        return productService.getProductByName(name);
    }

    //    update
    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    //    delete
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return productService.deleteProduct(id);
    }
}
