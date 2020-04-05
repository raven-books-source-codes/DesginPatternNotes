package desginpattern.flyweight;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/5 10:40
 */
public class ConcreteWebSite extends WebSite {
    public ConcreteWebSite(String type) {
        super(type);
    }

    @Override
    public void use(User user) {
        System.out.println(user + " use " + type);
    }
}
