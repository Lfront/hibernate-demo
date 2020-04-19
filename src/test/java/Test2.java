import entity.Goods;
import org.hibernate.Session;
import utils.HibernateUtil;

public class Test2 {
    public static void main(String[] args) {
        Session session= HibernateUtil.openSession();
//        Goods goods=(Goods)session.get(Goods.class,13);
        Goods goods=(Goods)session.load(Goods.class,12);
//        session.close();
        System.out.println(goods.getName());
    }
}
