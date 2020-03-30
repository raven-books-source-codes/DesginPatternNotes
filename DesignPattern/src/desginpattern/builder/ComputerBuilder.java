package desginpattern.builder;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/30 20:06
 */
public abstract class ComputerBuilder {
    protected Computer computer = new Computer();

    public abstract void setCpu();
    public abstract void setMemory( );
    public abstract void setHardDisk();

    public Computer build(){
        return this.computer;
    }
}
