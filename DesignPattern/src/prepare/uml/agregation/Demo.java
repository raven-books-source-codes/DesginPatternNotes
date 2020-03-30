package uml.agregation;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/26 15:04
 */
public class Demo {
}

class Computer{
    private Mouse mouse;

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    private Monitor monitor;

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
}

class Mouse{

}
class Monitor{

}