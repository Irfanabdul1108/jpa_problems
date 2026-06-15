package com.example;

import javax.persistence.*;
import java.util.List;

@Entity
public class Prod {

    @Id
    private int id;

    private String name;

    @OneToMany(mappedBy = "product",
               cascade = CascadeType.ALL)
    private List<Sale> sales;


    public Prod(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setSales(List<Sale> sales) {
        this.sales = sales;
    }
}