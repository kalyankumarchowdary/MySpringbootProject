package com.telusko.simpleWebApp.controller;

import com.telusko.simpleWebApp.model.Product;
import com.telusko.simpleWebApp.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@Tag(name = "Product Management", description = "APIs for managing products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    @Operation(summary = "Get all products", description = "Retrieve a list of all products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

   @GetMapping("/products/{prodId}")
   @Operation(summary = "Get product by ID", description = "Retrieve a product by its ID")
    public Product getProductById(
            @Parameter (description = "ID of the product to be retrieved", example = "101", required = true)
            @PathVariable int prodId){
        return productService.getProductById(prodId);
    }

    @PostMapping("/products")
    @Operation(summary = "Add a new product", description = "Create a new product")
    public void addProduct(@RequestBody Product prod) {
        productService.addProduct(prod);
        // Implementation for adding a product
    }

    @PutMapping("/products")
    @Operation(summary = "Update an existing product", description = "Update the details of an existing product")
    public void updateProduct(@RequestBody Product prod) {
        productService.updateProduct(prod);
        // Implementation for updating a product
    }

    @DeleteMapping("/products/{prodId}")
    @Operation(summary = "Delete a product", description = "Delete a product by its ID")
    public void deleteProduct(
            @Parameter (description = "ID of the product to be deleted", example = "101", required = true)
            @PathVariable int prodId) {
        productService.deleteProduct(prodId);
        // Implementation for deleting a product

    }




}
