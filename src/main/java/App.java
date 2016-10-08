import com.karienomen.teach.hibertest.domain.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by karienomen on 08.10.16.
 */
public class App {

    public static void main(String[] args) {

        UserDetails user = new UserDetails();
        user.setUserId(1);
        user.setUserName("First User");
        user.setAddress("User address");
        user.setDescriptions("User decsriptions");
        user.setJoinedDate(new Date());

        //save User
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();

        //Retrieve user object
        user = null;
        session = factory.openSession();
        session.beginTransaction();
        user = session.get(UserDetails.class, 1);

        System.out.println(user);

        session.close();

        factory.close();
    }
}
