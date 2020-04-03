package desginpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/3 10:16
 */
public class University extends OrganizationComponent {

    private List<OrganizationComponent> components = new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent component) {
        components.add(component);
    }

    @Override
    protected void remove(OrganizationComponent component) {
        components.remove(component);
    }

    @Override
    public void print() {
        System.out.println("------------------------------");
        System.out.println(getName() + ":" + getDes());
        for(OrganizationComponent component : components){
            component.print();
        }
    }
}
