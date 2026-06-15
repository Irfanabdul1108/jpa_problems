package com.example;

import javax.persistence.*;
import java.util.Arrays;

public class PublisherMain {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("jpa-unit");

        EntityManager em =
                emf.createEntityManager();

        Publisher p =
                new Publisher(1, "ABC");

        Title t1 =
                new Title(101, "Java");

        Title t2 =
                new Title(102, "Python");

        p.setTitles(Arrays.asList(t1, t2));

        em.getTransaction().begin();

        em.persist(p);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}