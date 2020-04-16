package desginpattern.strategy;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/16 9:52
 */
public abstract class Duck {
    public abstract void display();
    public void quark(){
        System.out.println("duck quark");
    }

    public void fly(){
        System.out.println("duck fly");
    }

    public void swim(){
        System.out.println("duck swim");
    }
}
