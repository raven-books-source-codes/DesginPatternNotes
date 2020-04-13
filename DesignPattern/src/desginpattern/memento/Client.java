package desginpattern.memento;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/13 20:48
 */
public class Client {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole(100,100);
        Caretaker caretaker = new Caretaker();
        // before attacks the boss
        System.out.println("before attacks the boss");
        System.out.println(gameRole);
        // take a snapshot of the gameRole
        caretaker.addMemento("before_attacks_state",gameRole.createMemento());

        // loss some values of the gameRole
        gameRole.setAttackValue(80);
        gameRole.setDefenseValue(80);
        System.out.println("after attacks");
        System.out.println(gameRole);

        // restore
        gameRole.restore(caretaker.getMemento("before_attacks_state"));
        System.out.println("after restore");
        System.out.println(gameRole);
    }
}
