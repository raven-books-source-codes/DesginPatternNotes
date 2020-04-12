package desginpattern.mediator;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/12 12:22
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
        register();
    }

    public abstract void sendMessage(String name, boolean state);

    public abstract void receiveMessage(boolean open);

    public abstract void register();
}
