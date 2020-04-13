package desginpattern.memento;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/13 20:45
 */
public class Memento {
    private  int attackValue;
    private int defenseValue;

    public Memento(int attackValue, int defenseValue) {
        this.attackValue = attackValue;
        this.defenseValue = defenseValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }

    public int getDefenseValue() {
        return defenseValue;
    }

    public void setDefenseValue(int defenseValue) {
        this.defenseValue = defenseValue;
    }
}
