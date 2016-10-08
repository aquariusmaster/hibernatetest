import com.karienomen.teach.hibertest.domain.Address;
import com.karienomen.teach.hibertest.domain.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

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
