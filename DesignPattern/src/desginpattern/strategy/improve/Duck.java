package desginpattern.strategy.improve;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/16 9:52
 */
public abstract class Duck {

    protected FlyBehaviour flyBehaviour;
    protected SwimBehaviour swimBehaviour;
    protected QuackBehaviour quackBehaviour;

    public Duck(FlyBehaviour flyBehaviour, SwimBehaviour swimBehaviour, QuackBehaviour quackBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.swimBehaviour = swimBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
        this.swimBehaviour = swimBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public abstract void display();
    public void quark(){
        if(quackBehaviour != null){
            quackBehaviour.quark();
        }
    }

    public void fly(){
        if(flyBehaviour!=null){
            flyBehaviour.fly();
        }
    }

    public void swim(){
        if(swimBehaviour!=null){
            swimBehaviour.swim();
        }
    }
}
