package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Main {
    public static void main(String[] args) {
        
        
        
        System.out.println("Hello world!");

        Students s1= new Students();
        s1.setRollNo(54);
        s1.setSName("shravan");
        s1.setSage(35);
        System.out.println(s1);


        Configuration cfm=new Configuration();
        cfm.addAnnotatedClass(com.example.Students.class);
        cfm.configure();
        SessionFactory SF= cfm.buildSessionFactory();

        Session session= SF.openSession();

        Transaction tra=session.beginTransaction();
        session.persist(s1);

        tra.commit();

        System.out.println(s1);


    }
}