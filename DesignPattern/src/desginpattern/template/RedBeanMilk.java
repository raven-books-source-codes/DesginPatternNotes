package desginpattern.template;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/7 9:13
 */
public class RedBeanMilk extends SoyaMilk {
    @Override
    public void addIngredients() {
        System.out.println("加入红豆");
    }
}
