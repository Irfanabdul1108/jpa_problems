package com.example;

import javax.persistence.*;
import java.util.Arrays;

public class SaleMain {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("jpa-unit");

        EntityManager em =
                emf.createEntityManager();

        Prod p =
                new Prod(1, "Laptop");

        Sale s1 =
                new Sale(101, 2);

        Sale s2 =
                new Sale(102, 5);

        s1.setProduct(p);
        s2.setProduct(p);

        p.setSales(Arrays.asList(s1, s2));

        em.getTransaction().begin();

        em.persist(p);
        em.persist(s1);
        em.persist(s2);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}