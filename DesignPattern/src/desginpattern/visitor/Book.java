package desginpattern.visitor;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/9 11:19
 */
public class Book implements Goods{

    private double price;
    private int page;
    private String name;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book() {
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.saleCountOnBook(this);
    }


    @Override
    public String toString() {
        return "Book{" +
                "price=" + price +
                ", page=" + page +
                ", name='" + name + '\'' +
                '}';
    }
}
