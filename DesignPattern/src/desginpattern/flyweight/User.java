package desginpattern.flyweight;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/5 10:39
 */
public class User {
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }
}
