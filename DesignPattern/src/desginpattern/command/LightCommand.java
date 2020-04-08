package desginpattern.command;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/8 10:37
 */
public class LightCommand extends Command {

    private LighteRecevier  lighteRecevier;

    public LightCommand(LighteRecevier lighteRecevier) {
        this.lighteRecevier = lighteRecevier;
    }

    @Override
    void on() {
        isOn = true;
        lighteRecevier.on();
    }

    @Override
    void off() {
        isOn = false;
        lighteRecevier.off();
    }

    @Override
    void undo() {
        if(isOn){
            lighteRecevier.off();
        }else{
            lighteRecevier.on();
        }
    }
}
