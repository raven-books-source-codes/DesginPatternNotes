package desginpattern.prototype.improve.clone;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/29 21:27
 */
public class DeepClone implements  Cloneable{
    private String name;
    private DeepCloneTarget deepCloneTarget;


    @Override
    protected DeepClone clone() throws CloneNotSupportedException {
        // 1. 先浅拷贝基础类型
        DeepClone obj = null;
        obj = (DeepClone) super.clone();
        obj.deepCloneTarget = obj.deepCloneTarget.clone();
        return obj;
    }

    public DeepClone(String name, DeepCloneTarget deepCloneTarget) {
        this.name = name;
        this.deepCloneTarget = deepCloneTarget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCloneTarget getDeepCloneTarget() {
        return deepCloneTarget;
    }

    public void setDeepCloneTarget(DeepCloneTarget deepCloneTarget) {
        this.deepCloneTarget = deepCloneTarget;
    }
}
