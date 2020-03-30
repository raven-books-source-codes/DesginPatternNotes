package desginpattern.factory.facotrymethod.pizza;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/28 9:21
 */
public abstract class Pizza {
    protected String name;

    public Pizza(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public void  prepare();
     public void  bake(){
         System.out.println(name+"baking");
     }
    public void  cut(){
        System.out.println(name+"cutting");
    }
    public void  box(){
        System.out.println(name+"boxing");
    }
}
