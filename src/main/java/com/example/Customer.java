package com.example;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customer {
    @Id
    private String cust_email;
    private String cust_name;
    private long cust_mbno;
  
    public Customer(String email,String name, long mbno){
        this.cust_email=email;
         this.cust_name=name;
          this.cust_mbno=mbno;
    }
     public String getCustEmail() {
        return cust_email;
    }

    public void setCustEmail(String email) {
        this.cust_email = email;
    }

    public String getName() {
        return cust_name;
    }

    public void setName(String name) {
        this.cust_name = name;
    }

    public long getMobileNo() {
        return cust_mbno;
    }

    public void setMobileNo(long mbno) {
        this.cust_mbno = mbno;
    }

}