package desginpattern.strategy.improve;

import desginpattern.strategy.personalthinking.Behaviour;
import desginpattern.strategy.personalthinking.JumpBehaviour;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/16 10:30
 */
public abstract class NewDuck {
    protected Behaviour behaviour;

    public NewDuck(Behaviour behaviour) {
        this.behaviour = behaviour;
    }

    public void jump(){
        if(behaviour != null && behaviour instanceof JumpBehaviour){
            ((JumpBehaviour)behaviour).jump();
        }
    }
}
