package desginpattern.mediator;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/12 12:31
 */
public class Curtains extends Colleague {
    public Curtains(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendMessage(String name, boolean state) {
        mediator.sendMessage(name,state);
    }

    @Override
    public void receiveMessage(boolean open) {
        if(open){
            System.out.println("Curtains open");
        }else{
            System.out.println("Curtains close");
        }
    }

    @Override
    public void register() {
        mediator.registerColleague(MachineName.Curtains,this);
    }
}
