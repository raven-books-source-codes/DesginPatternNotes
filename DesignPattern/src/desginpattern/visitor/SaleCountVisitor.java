package desginpattern.visitor;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/9 11:26
 */
public class SaleCountVisitor implements Visitor {
    /**
     * @param book
     * 对大于500页的书，打8折活动
     */
    @Override
    public void saleCountOnBook(Book book) {
        double price = book.getPrice();
        if(book.getPage() >= 500){
            price = price*0.8;
        }
        book.setPrice(price);
    }

    /**
     * 水果每买一斤，单位价格下降1%
     * @param fruit
     */
    @Override
    public void saleCountOnFruit(Fruit fruit) {
        int weight = (int) fruit.getWeight();
        double pricePerWeight = fruit.getPricePerWeight();
        for(int i =0;i<weight;i++){
            pricePerWeight*=0.99;
        }
        fruit.setPricePerWeight(pricePerWeight);
    }
}
