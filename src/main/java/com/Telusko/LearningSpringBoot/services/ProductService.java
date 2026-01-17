package com.Telusko.LearningSpringBoot.services;

import com.Telusko.LearningSpringBoot.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101 , "iPhone" , 1000),
            new Product(102 , "Camera" , 2000),
            new Product(103 , "Bike" , 9000)
    ));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int id){
        return products.stream()
                .filter(p -> p.getProductId() == id)
                .findFirst()
                .orElse(new  Product(99999 , "No item" , 999999));
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void UpdateProduct(Product product){
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getProductId() == product.getProductId()){
                index = i;
            }
        }
        products.set(index, product);
    }

    public void deleteProductById(int id) {
        products.removeIf(p -> p.getProductId() == id);
    }
}
