package desginpattern.mediator;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/12 12:32
 */
public abstract class Mediator {
    public abstract void sendMessage(String toWhom, boolean open);

    public abstract void registerColleague(String name, Colleague colleague);
}
