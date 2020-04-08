package desginpattern.command;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/8 10:35
 */
public abstract class Command {

    protected  boolean isOn = false;

    abstract void on();

    abstract void off();

    abstract void undo();
}
