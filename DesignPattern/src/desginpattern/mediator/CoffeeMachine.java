package desginpattern.mediator;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/12 12:30
 */
public class CoffeeMachine extends Colleague{

    public CoffeeMachine(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendMessage(String name, boolean state) {
        mediator.sendMessage(name,state);
    }

    @Override
    public void receiveMessage(boolean open) {
        if(open){
            System.out.println("CoffeeMachine open");
        }else{
            System.out.println("CoffeeMachine close");
        }
    }

    @Override
    public void register() {
        mediator.registerColleague(MachineName.COFFEE_MACHINE,this);
    }
}
