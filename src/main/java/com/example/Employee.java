package com.example;

import javax.persistence.*;

@Entity
@Table(name = "employee_table")
public class Employee {

    @Id
    private int id;

    private String name;

    @OneToOne(mappedBy = "employee")
    private LibMembership membership;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LibMembership getMembership() {
        return membership;
    }

    public void setMembership(LibMembership membership) {
        this.membership = membership;
    }
}