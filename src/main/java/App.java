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

        Calendar calendar = Calendar.getInstance();
        long now = calendar.getTimeInMillis();
        user.setJoinedDate(new Date(now));

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
    }
}
