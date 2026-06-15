package com.example;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class TitleMain {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("myPU");

        EntityManager em = emf.createEntityManager();

        // Insert sample data
        em.getTransaction().begin();

        em.persist(new Title1(1, "Java Basics", 8));
        em.persist(new Title1(2, "Hibernate", 15));
        em.persist(new Title1(3, "Spring Boot", 18));
        em.persist(new Title1(4, "React JS", 25));

        em.getTransaction().commit();

        // Criteria Query
        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Title1> cq =
                cb.createQuery(Title1.class);

        Root<Title1> title =
                cq.from(Title1.class);

        cq.select(title)
          .where(cb.between(title.get("price"), 10.0, 20.0));

        List<Title1> result =
                em.createQuery(cq).getResultList();

        System.out.println("Titles with price between 10 and 20:");

        for (Title1 t : result) {
            System.out.println(
                    t.getId() + " "
                  + t.getName() + " "
                  + t.getPrice());
        }

        em.close();
        emf.close();
    }
}