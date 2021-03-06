package desginpattern.visitor;


/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/9 11:11
 */
public interface Visitor {
    void saleCountOnBook(Book book);
    void saleCountOnFruit(Fruit fruit);
}
