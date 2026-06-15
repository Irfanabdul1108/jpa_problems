package com.example;

import javax.persistence.Entity;

@Entity
public class OnlineCourse extends Courses {

    private String platform;

    public OnlineCourse(int id,
                        String title,
                        double price,
                        String platform) {

        super(id, title, price);
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }

    @Override
    public String toString() {

        return "OnlineCourse{" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", price=" + getPrice() +
                ", platform='" + platform + '\'' +
                '}';
    }
}