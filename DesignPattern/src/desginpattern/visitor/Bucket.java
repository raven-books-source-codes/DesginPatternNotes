package desginpattern.visitor;

import java.util.Arrays;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/9 11:38
 */
public class Bucket {
    private Goods[] goods;

    public Bucket(Goods[] goods) {
        this.goods = goods;
    }

    public void saleCount(Visitor visitor){
        for(Goods goods: goods){
            goods.accept(visitor);
        }
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "goods=" + Arrays.toString(goods) +
                '}';
    }
}
