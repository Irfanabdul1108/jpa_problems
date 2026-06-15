package com.example;

import javax.persistence.*;

@Entity
public class Title {

    @Id
    private int id;

    private String name;

    public Title(int id, String name) {
        this.id = id;
        this.name = name;
    }
}