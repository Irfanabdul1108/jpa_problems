package com.example;

import javax.persistence.*;

@Entity
@Table(name="order_products")
public class OrderProduct {

    @Id
    @GeneratedValue(strategy =
            GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name="product_id")
    private OrdProduct product;

    private int quantity;

    public OrderProduct() {
    }

    public OrderProduct(Order order,
                        OrdProduct product,
                        int quantity) {
        this.order = order;
        this.product = product;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public OrdProduct getProduct() {
        return product;
    }
}