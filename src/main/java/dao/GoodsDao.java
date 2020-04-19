package dao;

import com.sun.org.apache.bcel.internal.generic.LSTORE;
import entity.Goods;

import java.util.List;

public interface GoodsDao {
    /**
     * 根据id查询商品
     * @param id
     * @return
     */
    public Goods getGoodsById(int id);

    /**
     * 增加商品
     * @param goods
     */
    public void add(Goods goods);

    public void update(Goods goods);

    public void del(int id);
    public List<Goods> getList();
}
