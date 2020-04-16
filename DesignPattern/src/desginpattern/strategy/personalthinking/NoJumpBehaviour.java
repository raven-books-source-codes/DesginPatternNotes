package desginpattern.strategy.personalthinking;

import desginpattern.strategy.personalthinking.JumpBehaviour;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/16 10:29
 */
public class NoJumpBehaviour implements JumpBehaviour {
    @Override
    public void jump() {
        System.out.println("can't jump");
    }

    @Override
    public void execute() {
        jump();
    }
}
