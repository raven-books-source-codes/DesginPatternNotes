package desginpattern.memento;

import desginpattern.iterator.Menu;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/13 20:42
 * 角色玩家
 */
public class GameRole {
    // 攻击力
    private int attackValue;
    // 防御力
    private int defenseValue;

    @Override
    public String toString() {
        return "GameRole{" +
                "attackValue=" + attackValue +
                ", defenseValue=" + defenseValue +
                '}';
    }

    public GameRole(int attackValue, int defenseValue) {
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

    public Memento createMemento(){
        return new Memento(this.attackValue,this.defenseValue);
    }

    public void restore(Memento memento){
        this.attackValue = memento.getAttackValue();
        this.defenseValue = memento.getDefenseValue();
    }
}
