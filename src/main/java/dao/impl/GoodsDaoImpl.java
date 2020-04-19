package dao.impl;

import dao.GoodsDao;
import entity.Goods;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

import java.util.List;

public class GoodsDaoImpl implements GoodsDao {
    public Goods getGoodsById(int id) {
        Session session=null;
        try {
            session = HibernateUtil.openSession();
            return (Goods) session.get(Goods.class, id);
        }catch (Exception e){
            e.printStackTrace();
            return  null;
        } finally {
            session.close();
        }
    }

    public void add(Goods goods) {
        Session session=null;
        Transaction tx=null;
        try {
            session=HibernateUtil.openSession();
            tx=session.beginTransaction();
            session.save(goods);
            tx.commit();
        }catch (Exception e){
            e.printStackTrace();
            tx.rollback();
        }
        finally {
            session.close();
        }

    }

    public void update(Goods goods) {
        Session session=null;
        Transaction tx=null;
        try {
            session=HibernateUtil.openSession();
            tx=session.beginTransaction();
            session.update(goods);
            tx.commit();
        }catch (Exception e){
            e.printStackTrace();
            tx.rollback();
        }
        finally {
            session.close();
        }
    }

    public void del(int id) {
        Session session=null;
        Transaction tx=null;
        try {
            session=HibernateUtil.openSession();
            tx=session.beginTransaction();
            //根据主键id查询商品信息
           Goods goods=(Goods)session.load(Goods.class,id);
           session.delete(goods);
            tx.commit();
        }catch (Exception e){
            e.printStackTrace();
            tx.rollback();
        }
        finally {
            session.close();
        }
    }

    public List<Goods> getList() {
        Session session=null;
        try {
            session = HibernateUtil.openSession();
            return session.createQuery("from Goods").list();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
        finally {
            session.close();
        }
    }
}
