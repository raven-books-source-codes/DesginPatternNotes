package desginpattern.builder;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/30 20:42
 */
public class Director {
    private ComputerBuilder cb;

    public Director(ComputerBuilder cb) {
        this.cb = cb;
    }

    public void setCb(ComputerBuilder cb) {
        this.cb = cb;
    }

    public Computer build(){
        cb.setCpu();
        cb.setMemory();
        cb.setHardDisk();
        return cb.build();
    }
}
