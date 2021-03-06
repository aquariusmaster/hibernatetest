package com.karienomen.hibertest;

import com.karienomen.hibertest.domain.*;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import java.util.Date;
import java.util.List;

/**
 * Created by karienomen on 08.10.16.
 */
public class App {

    public static void main(String[] args) {

//        UserDetails user = new UserDetails();
//        user.setUserName("Second User");
//
//        Address address1 = new Address();
//        address1.setStreet("Kopernika 16");
//        address1.setCity("Kyiv");
//        address1.setRegion("Kyivska");
//        address1.setCountry("Ukraine");
//
//        user.getListOfAddresses().add(address1);
//
//        user.setDescriptions("User decsriptions");
//        user.setJoinedDate(new Date());
//
////        Computer computer = new Computer();
////        computer.setName("Computer");
////        user.setComputer(computer);
//
////        Notebook note = new Notebook();
////        note.setName("Laptop");
////        note.setScreenSize(12.5f);
//
//        PC pc = new PC();
//        pc.setName("Desktop");
//        pc.setArchitecture("775");
//
//        user.setComputer(pc);

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();

        System.out.println("First step");

        Query query = session.createQuery("from UserDetails where userId = 2");
        query.setCacheable(true);
        query.list();

        UserDetails user = session.get(UserDetails.class, 2);
//        System.out.println("User1: " + user);


        session.close();

        System.out.println("Second step");

        Session session2 = factory.openSession();
        session2.beginTransaction();


        Query query2 = session2.createQuery("from UserDetails where userId = 2");
        query2.setCacheable(true);
        query2.list();

        UserDetails user1 = session2.get(UserDetails.class, 2);
//        System.out.println("User2: " +user1);

        session2.close();
        factory.close();

    }
}
