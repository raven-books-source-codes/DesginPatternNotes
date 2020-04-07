package desginpattern.template;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/7 9:10
 * 豆浆
 */
public abstract class SoyaMilk {
    /**
     * 制作框架
     */
    public final void make(){
        select();
        soak();
        shatter();
        hook();
    }

    protected void hook(){

    }

    protected void select(){
        System.out.println("选择黄豆");
    }

    protected abstract void addIngredients();

    protected void soak(){
        System.out.println("浸泡");
    }

    protected void shatter(){
        System.out.println("打碎");
    }


}
