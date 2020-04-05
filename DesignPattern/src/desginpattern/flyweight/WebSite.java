package desginpattern.flyweight;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/5 10:39
 */
public abstract class WebSite {

    // type 是内部状态
    protected String type;

    public WebSite(String type) {
        this.type = type;
    }

    // user 是外部状态
    public abstract void use(User user);
}
