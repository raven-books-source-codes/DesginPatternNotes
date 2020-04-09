package desginpattern.visitor;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/9 11:38
 */
public class Client {
    public static void main(String[] args) {
        // 定义商品
        Book book = new Book();
        book.setPrice(100.0);
        book.setPage(600);
        book.setName("设计模式");
        Fruit fruit = new Fruit();
        fruit.setPricePerWeight(10);
        fruit.setName("苹果");
        fruit.setWeight(5);

        // 装入篮中
        Goods[] goods = new Goods[]{book,fruit};
        Bucket bucket = new Bucket(goods);  // 其实bucket略有多余，不过不影响

        // 执行打折
        Visitor visitor = new SaleCountVisitor();
        bucket.saleCount(visitor);

        // 打折后商品信息
        System.out.println(bucket);
    }
}
