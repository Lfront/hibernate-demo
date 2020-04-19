package utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;
    static {
        Configuration con=new Configuration().configure();
        sessionFactory=con.buildSessionFactory();
    }
    public static Session openSession(){
        return sessionFactory.openSession();
    }
}
