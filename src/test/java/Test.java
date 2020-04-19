import dao.GoodsDao;
import dao.impl.GoodsDaoImpl;
import entity.Goods;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test {
    public static void main(String [] args){
//        //创建configuration对象
//        Configuration conf=new Configuration().configure();
//        //创建sessionFactory对象
//        SessionFactory sessionFactory=conf.buildSessionFactory();
//        //创建session对象
//        Session session=sessionFactory.openSession();
//        //根据主键查询商品对象
//        Goods goods= (Goods) session.get(Goods.class,1);
//        System.out.println(goods);
//        session.close();
        GoodsDao goodsDao=new GoodsDaoImpl();
//        Goods goods=new Goods();
//        goods.setName("test");
//        goods.setImgUrl("");
//        goodsDao.add(goods);
//        Goods goods=goodsDao.getGoodsById(41);
//        goods.setPrice(100.0);
//        goods.setStock(100);
//        goods.setGoodsType(1);
//       goodsDao.update(goods);
//        goodsDao.del(41);
        List<Goods>list=goodsDao.getList();
        for (Goods g:list){
            System.out.println(g);
        }
    }
}
