package com.example;

import javax.persistence.*;

public class CustomerMain {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("jpa-unit");

        EntityManager em =
                emf.createEntityManager();

        Customer cus =
                new Customer("1@gmail.com","Abdul",243546556);
                
        em.getTransaction().begin();
        em.persist(cus);
           em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
