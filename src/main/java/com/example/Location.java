package com.example;

import javax.persistence.Embeddable;

@Embeddable
public class Location {

    private String inst_name;
    private String inst_address;
    private String inst_city;

  
    public Location(String name,
                    String address,
                    String city) {

        this.inst_name = name;
        this.inst_address = address;
        this.inst_city = city;
    }

    public String getInst_name() {
        return inst_name;
    }

    public void setInst_name(String inst_name) {
        this.inst_name = inst_name;
    }

    public String getInst_address() {
        return inst_address;
    }

    public void setInst_address(String inst_address) {
        this.inst_address = inst_address;
    }

    public String getInst_city() {
        return inst_city;
    }

    public void setInst_city(String inst_city) {
        this.inst_city = inst_city;
    }
}