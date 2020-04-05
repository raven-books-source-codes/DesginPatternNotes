package desginpattern.flyweight;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/5 10:42
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        WebSite blog = factory.getWebSite("blog");
        blog.use(new User("zhang"));

        WebSite comp = factory.getWebSite("comp");
        comp.use(new User("zhang"));

        WebSite personalBlog = factory.getWebSite("blog");
        personalBlog.use(new User("zhang"));

        System.out.println(factory.webSizeCount());
    }
}
