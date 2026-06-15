package com.example;

import javax.persistence.*;

public class EmployeeMain {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("jpa-unit");

        EntityManager em =
                emf.createEntityManager();

        Employee emp =
                new Employee(1, "Abdul");

        LibMembership mem =
                new LibMembership(
                        101,
                        "Gold",
                        "2025-06-11"
                );

        emp.setMembership(mem);
        mem.setEmployee(emp);

        em.getTransaction().begin();

        em.persist(emp);
        em.persist(mem);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}