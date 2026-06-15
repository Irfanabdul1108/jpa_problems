package com.example;

import javax.persistence.*;

public class Transaction_prod_main {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("jpa-unit");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();

        try {

            tx.begin();

            Transaction_prod p1 = em.find(Transaction_prod.class, 1);
            Transaction_prod p2 = em.find(Transaction_prod.class, 2);

            if (p1 == null || p2 == null) {
                throw new RuntimeException("Product not found");
            }

            int transferQty = 10;

            if (p1.getQuantity() < transferQty) {
                throw new RuntimeException(
                        "Insufficient Quantity");
            }

            p1.setQuantity(
                    p1.getQuantity() - transferQty);

            p2.setQuantity(
                    p2.getQuantity() + transferQty);

            em.merge(p1);
            em.merge(p2);

            tx.commit();

            System.out.println(
                    "Transaction Committed Successfully");

        } catch (Exception e) {

            System.out.println(
                    "Exception Occurred : " + e.getMessage());

            if (tx.isActive()) {
                tx.rollback();
                System.out.println(
                        "Transaction Rolled Back");
            }
        }

        em.close();
        emf.close();
    }
}