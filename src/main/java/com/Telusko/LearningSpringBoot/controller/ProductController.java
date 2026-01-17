package com.Telusko.LearningSpringBoot.controller;

import com.Telusko.LearningSpringBoot.model.Product;
import com.Telusko.LearningSpringBoot.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @RequestMapping("/products/{id}")
    public Product getProductById(@PathVariable int id){
        return service.getProductById(id);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product){
        service.addProduct(product);
    }


}
