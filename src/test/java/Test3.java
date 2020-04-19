import entity.Account;
import entity.Goods;
import org.hibernate.Session;
import utils.HibernateUtil;

public class Test3 {
    public static void main(String[] args) {
        Session session= HibernateUtil.openSession();

//        Account account= (Account) session.get(Account.class,1);
//        System.out.println(account.getOpenId()+"\t"+account.getPrice());
        Goods goods=(Goods)session.get(Goods.class,31);
        System.out.println(goods.getName());
        for (Account a:goods.getAccountSet()){
            System.out.println(a.getId()+"\t"+a.getOpenId());
        }
    }
}
