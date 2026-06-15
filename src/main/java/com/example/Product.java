package com.example;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_table")
public class Product {

    @Id
    public int prod_id;

    public String prod_name;

    public double prod_price;

    public String prod_features;

  

    public Product(int id,
                   String name,
                   double price,
                   String features) {

        this.prod_id = id;
        this.prod_name = name;
        this.prod_price = price;
        this.prod_features = features;
    }

    public String getProd_name() {
        return prod_name;
    }

    public double getProd_price() {
        return prod_price;
    }

    public String getProd_features() {
        return prod_features;
    }
}