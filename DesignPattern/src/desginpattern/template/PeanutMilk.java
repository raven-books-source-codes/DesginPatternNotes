package desginpattern.template;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/7 9:14
 * 花生
 */
public class PeanutMilk extends SoyaMilk {
    @Override
    public void addIngredients() {
        System.out.println("加入花生");
    }
}
