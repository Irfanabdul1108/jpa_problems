package com.example;

import javax.persistence.*;

public class CourseMain {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("jpa-unit");

        EntityManager em =
                emf.createEntityManager();

        Course cos =
                new Course("dsa",25000.00);

        Location loc =
                new Location("roy","gajuwaka","vizag");
                    cos.setLocation(loc);
        em.getTransaction().begin();
        em.persist(cos);
           em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
