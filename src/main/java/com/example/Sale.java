package com.example;

import javax.persistence.*;

@Entity
public class Sale {

    @Id
    private int id;

    private int qty;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Prod product;


    public Sale(int id, int qty) {
        this.id = id;
        this.qty = qty;
    }

    public void setProduct(Prod product) {
        this.product = product;
    }
}