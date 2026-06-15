package com.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProductMain {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("jpa-unit");

        EntityManager em =
                emf.createEntityManager();

        Product p =
                new Product(
                        2,
                        "laptop",
                        25000.00,
                        "8GB RAM, SSD, i5 Processor"
                );

        em.getTransaction().begin();

        em.persist(p);

        em.getTransaction().commit();

        System.out.println("Product Name : "
                + p.getProd_name());

        System.out.println("Product Price : "
                + p.getProd_price());

        System.out.println("Product Features : "
                + p.getProd_features());

        em.close();
        emf.close();
    }
}