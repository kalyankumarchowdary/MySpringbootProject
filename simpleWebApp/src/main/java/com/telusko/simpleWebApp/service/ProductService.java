package com.telusko.simpleWebApp.service;

import com.telusko.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Arrays;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(1,"Laptop",25000),
            new Product(2,"Phone",15000),
            new Product(3,"Tablet",20000)
    );

    public List<Product> getProducts(){
        return products;
    }
}
