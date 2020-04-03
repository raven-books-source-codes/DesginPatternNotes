package desginpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/3 10:20
 */
public class College extends OrganizationComponent {

    private List<OrganizationComponent> components = new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent component) {
        // 实际业务中，college的add方法和university不一定相同
        components.add(component);
    }

    @Override
    protected void remove(OrganizationComponent component) {
        components.remove(component);
    }

    @Override
    public void print() {
        System.out.println("---------------------------");
        System.out.println(getName() + ":" + getDes());
        for(OrganizationComponent component : components){
            component.print();
        }
    }
}
