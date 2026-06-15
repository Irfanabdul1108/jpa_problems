package com.example;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="orders")
public class Order {

    @Id
    private int orderId;

    private String customerName;

    @OneToMany(mappedBy = "order",
               cascade = CascadeType.ALL)
    private List<OrderProduct> orderProducts =
            new ArrayList<>();


    public Order(int orderId,
                 String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    public void addProduct(
            OrdProduct product,
            int quantity) {

        OrderProduct op =
                new OrderProduct(this,
                                 product,
                                 quantity);

        orderProducts.add(op);
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }
}