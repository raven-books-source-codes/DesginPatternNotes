package desginpattern.builder;

import desginpattern.builder.Computer;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/30 19:49
 */
public class HighComputerBuilder extends ComputerBuilder{

    @Override
    public void setCpu() {
        computer.setCpu("i9-9900X");
    }

    @Override
    public void setMemory() {
        computer.setMemory("16G");
    }

    @Override
    public void setHardDisk() {
        computer.setHardDisk("512G固态");
    }
}
