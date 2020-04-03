package desginpattern.composite;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/3 10:22
 */
public class Department extends OrganizationComponent {

    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public void print() {
        System.out.println(getName()+":"+getDes());
    }
}
