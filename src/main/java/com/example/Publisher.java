package com.example;

import javax.persistence.*;
import java.util.List;

@Entity
public class Publisher {

    @Id
    private int id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Title> titles;


    public Publisher(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setTitles(List<Title> titles) {
        this.titles = titles;
    }
}