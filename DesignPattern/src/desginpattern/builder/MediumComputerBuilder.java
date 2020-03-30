package desginpattern.builder;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/30 19:50
 */
public class MediumComputerBuilder extends ComputerBuilder{
    @Override
    public void setCpu() {
        computer.setCpu("i7-8700");
    }

    @Override
    public void setMemory() {
        computer.setMemory("16G");
    }

    @Override
    public void setHardDisk() {
        computer.setHardDisk("256G固态");
    }
}
