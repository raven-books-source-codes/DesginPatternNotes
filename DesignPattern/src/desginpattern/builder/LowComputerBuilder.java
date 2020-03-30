package desginpattern.builder;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/30 19:51
 */
public class LowComputerBuilder extends ComputerBuilder{
    @Override
    public void setCpu() {
        computer.setCpu("i3-8100");
    }

    @Override
    public void setMemory() {
        computer.setMemory("8G");
    }

    @Override
    public void setHardDisk() {
        computer.setHardDisk("128G");
    }
}
