package desginpattern.iterator;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/10 10:00
 */
public class MenuItem {
    private String name;
    private String desc;
    private double price;

    public MenuItem(String name, String desc, double price) {
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
