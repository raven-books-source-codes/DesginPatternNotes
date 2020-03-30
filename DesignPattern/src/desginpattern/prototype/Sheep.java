package desginpattern.prototype;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/29 20:19
 */
public class Sheep implements Cloneable {
    private String name;
    private int age;
    private String color;

//    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        return (Sheep)super.clone();
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
}
