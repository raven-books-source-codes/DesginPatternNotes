package desginpattern.composite;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/3 10:12
 */
public abstract class OrganizationComponent {
    private String name;
    private String des;

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    protected void add(OrganizationComponent component){
        // 默认实现
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent component){
        throw new UnsupportedOperationException();
    }

    // 该方法所有子类都需要实现
    public abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
