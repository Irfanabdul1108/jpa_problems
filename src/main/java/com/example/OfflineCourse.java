package com.example;

import javax.persistence.Entity;

@Entity
public class OfflineCourse extends Courses {

    private String location;

    public OfflineCourse(int id,
                         String title,
                         double price,
                         String location) {

        super(id, title, price);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {

        return "OfflineCourse{" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", price=" + getPrice() +
                ", location='" + location + '\'' +
                '}';
    }
}