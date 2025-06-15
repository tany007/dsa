package org.example.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class StudentServiceDemo {
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public void addStudent(String name, String email) {
        // Implementation to add a student
       // Session session = sessionFactory.openSession();

        try(Session session = sessionFactory.openSession())
        {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
