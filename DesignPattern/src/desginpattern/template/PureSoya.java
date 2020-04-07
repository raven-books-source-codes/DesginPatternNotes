package desginpattern.template;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/7 9:19
 */
public class PureSoya extends SoyaMilk {
    @Override
    public void addIngredients() {

    }

    @Override
    protected void hook() {
        System.out.println("用精美容器装");
    }
}
