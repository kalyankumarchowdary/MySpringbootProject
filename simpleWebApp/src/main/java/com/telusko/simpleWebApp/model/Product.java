package com.telusko.simpleWebApp.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Product {

    @Id
    @Schema (description = "Unique identifier of the Product.", example = "101", required = true)
    private int prodId;
    @Schema (description = "Name of the Product.", example = "Laptop", required = true)
    private String prodname;
    @Schema (description = "Price of the Product.", example = "1500", required = true)
    private int price;

    public Product() {
    }


    public Product(int prodId, String prodname, int price) {
        this.prodId = prodId;
        this.prodname = prodname;
        this.price = price;
    }

    public int getProdId() {
        return prodId;
    }
    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdname() {
        return prodname;
    }

    public void setProdname(String prodname) {
        this.prodname = prodname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", prodname='" + prodname + '\'' +
                ", price=" + price +
                '}';
    }




}
