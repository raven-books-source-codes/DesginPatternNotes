package desginpattern.prototype.improve.clone;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/29 21:27
 */
public class DeepCloneTarget implements  Cloneable{

    private String id;

    public DeepCloneTarget(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    protected DeepCloneTarget clone() throws CloneNotSupportedException {
        return (DeepCloneTarget) super.clone();
    }
}
