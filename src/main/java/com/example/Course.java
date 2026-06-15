package com.example;

import javax.persistence.*;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int course_id;

    private String course_title;

    private double course_fee;

    @Embedded
    private Location location;

  

    public Course(String title, double fee) {
        this.course_title = title;
        this.course_fee = fee;
    }

    public int getCourse_id() {
        return course_id;
    }

    public String getCourse_title() {
        return course_title;
    }

    public void setCourse_title(String course_title) {
        this.course_title = course_title;
    }

    public double getCourse_fee() {
        return course_fee;
    }

    public void setCourse_fee(double course_fee) {
        this.course_fee = course_fee;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}