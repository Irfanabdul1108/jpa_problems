package com.example;

import javax.persistence.*;

@Entity
@Table(name = "trans_products")
public class Transaction_prod {

    @Id
    private int id;

    private String name;
    private int quantity;


    public Transaction_prod(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}