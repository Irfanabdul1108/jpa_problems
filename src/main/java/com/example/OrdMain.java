package com.example;

import javax.persistence.*;

public class OrdMain {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("myPU");

        EntityManager em =
                emf.createEntityManager();

        EntityTransaction tx =
                em.getTransaction();

        try {

            tx.begin();

            OrdProduct p1 =
                    new OrdProduct(101,
                            "Laptop",
                            50000);

            OrdProduct p2 =
                    new OrdProduct(102,
                            "Mouse",
                            500);

            em.persist(p1);
            em.persist(p2);

            Order order =
                    new Order(1,
                            "Abdul");

            order.addProduct(p1,1);
            order.addProduct(p2,2);

            em.persist(order);

            tx.commit();

            System.out.println(
                    "Order Saved");

        } catch(Exception e) {

            tx.rollback();
            e.printStackTrace();
        }

        em.close();
        emf.close();
    }
}