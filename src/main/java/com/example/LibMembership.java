package com.example;

import javax.persistence.*;

@Entity
@Table(name = "library_membership")
public class LibMembership {

    @Id
    private int store_id;

    private String membership_type;

    private String start_date;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public LibMembership(int store_id,
                             String membership_type,
                             String start_date) {

        this.store_id = store_id;
        this.membership_type = membership_type;
        this.start_date = start_date;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}