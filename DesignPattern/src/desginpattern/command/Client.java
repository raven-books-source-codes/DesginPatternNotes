package desginpattern.command;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/8 10:43
 */
public class Client {
    public static void main(String[] args) {
        // Lighter
        LighteRecevier lighteRecevier = new LighteRecevier();
        // LightCommand
        Command lightCommand = new LightCommand(lighteRecevier);
        // RemoteController
        RemoteController remoteController = new RemoteController();
        // set command into remote controller
        remoteController.setCommand(0,lightCommand);
        // execute on
        remoteController.buttonOnPushed(0);
        // execute off
        remoteController.buttonOffPushed(0);
        // execute undo
        remoteController.undo();
    }
}
