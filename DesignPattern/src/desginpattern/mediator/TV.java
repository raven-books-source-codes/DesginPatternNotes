package desginpattern.mediator;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/12 12:29
 */
public class TV extends Colleague{
    public TV(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendMessage(String name, boolean state) {
        mediator.sendMessage(name,state);
    }

    @Override
    public void receiveMessage(boolean open) {
        if(open){
            System.out.println("TV open");
        }else{
            System.out.println("TV close");
        }
    }

    @Override
    public void register() {
        mediator.registerColleague(MachineName.TV,this);
    }
}
