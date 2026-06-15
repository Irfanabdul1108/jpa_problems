package com.example;

import javax.persistence.*;

public class CoursesMain {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("jpa-unit");

        EntityManager em =
                emf.createEntityManager();

        EntityTransaction tx =
                em.getTransaction();

        tx.begin();

        OnlineCourse c1 =
                new OnlineCourse(
                        1,
                        "Java",
                        15,
                        "Udemy");

        OnlineCourse c2 =
                new OnlineCourse(
                        2,
                        "Spring Boot",
                        25,
                        "Coursera");

        OfflineCourse c3 =
                new OfflineCourse(
                        3,
                        "Python",
                        18,
                        "Hyderabad");

        OfflineCourse c4 =
                new OfflineCourse(
                        4,
                        "React",
                        30,
                        "Bangalore");

        em.persist(c1);
        em.persist(c2);
        em.persist(c3);
        em.persist(c4);

        tx.commit();

        em.close();
        emf.close();

        System.out.println("Courses Saved");
    }
}