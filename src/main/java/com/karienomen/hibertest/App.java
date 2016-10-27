package com.karienomen.hibertest;

import com.karienomen.hibertest.domain.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Date;
import java.util.List;

/**
 * Created by karienomen on 08.10.16.
 */
public class App {

    public static void main(String[] args) {

        UserDetails user = new UserDetails();
        user.setUserName("First User");

        Address address1 = new Address();
        address1.setStreet("Kopernika 16");
        address1.setCity("Kyiv");
        address1.setRegion("Kyivska");
        address1.setCountry("Ukraine");

        Address address2 = new Address();
        address2.setStreet("Artema");
        address2.setCity("Kyiv");
        address2.setRegion("Kyivska");
        address2.setCountry("Ukraine");

        user.getListOfAddresses().add(address1);
        user.getListOfAddresses().add(address2);

        user.setDescriptions("User decsriptions");
        user.setJoinedDate(new Date());

        Computer computer = new Computer();
        computer.setName("Computer");
        user.setComputer(computer);

        Notebook note = new Notebook();
        note.setName("Laptop");
        note.setScreenSize(12.5f);

        PC pc = new PC();
        pc.setName("Desktop");
        pc.setArchitecture("775");

        System.out.println(note);
        System.out.println(pc);

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
//        session.save(computer);
//        session.save(note);
//        session.save(pc);
//        session.save(user);

        session.getTransaction().commit();
        Query query = session.getNamedQuery("UserDetails.byId");
        query.setParameter(0, 4);
        UserDetails fetchedUser = (UserDetails) query.getSingleResult();

        System.out.println("USerDetails fetched: " + fetchedUser);

        session.close();
        factory.close();

    }
}
