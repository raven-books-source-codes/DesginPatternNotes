package desginpattern.responsiblitychain;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/17 14:56
 */
public class Request {
    private int price;

    public Request(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
