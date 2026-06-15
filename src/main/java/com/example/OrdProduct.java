package com.example;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="ordproducts")
public class OrdProduct {

    @Id
    private int productId;

    private String productName;

    private double price;

    @OneToMany(mappedBy = "product",
               cascade = CascadeType.ALL)
    private List<OrderProduct> orderProducts =
            new ArrayList<>();


    public OrdProduct(int productId,
                   String productName,
                   double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}