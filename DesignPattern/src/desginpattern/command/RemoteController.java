package desginpattern.command;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/8 10:39
 */
public class RemoteController {

    private Command[] commands;
    private Command undoCommand;

    public RemoteController() {
        commands = new Command[5];
        for(int i = 0;i<commands.length;i++){
            commands[i] = new NoCommand();
        }
        undoCommand = new NoCommand();
    }

    public void setCommand(int idx, Command command){
        commands[idx] = command;
    }


    public void buttonOnPushed(int idx){
        commands[idx].on();
        undoCommand = commands[idx];
    }

    public void buttonOffPushed(int idx){
        commands[idx].off();
        undoCommand = commands[idx];
    }

    public void undo(){
        undoCommand.undo();
    }
}
