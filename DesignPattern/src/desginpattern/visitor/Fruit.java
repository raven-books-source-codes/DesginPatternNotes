package desginpattern.visitor;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/9 11:19
 */
public class Fruit implements Goods{

    private double weight;
    private double pricePerWeight;
    private String name;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPricePerWeight() {
        return pricePerWeight;
    }

    public void setPricePerWeight(double pricePerWeight) {
        this.pricePerWeight = pricePerWeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fruit() {
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.saleCountOnFruit(this);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                ", pricePerWeight=" + pricePerWeight +
                ", name='" + name + '\'' +
                '}';
    }
}
