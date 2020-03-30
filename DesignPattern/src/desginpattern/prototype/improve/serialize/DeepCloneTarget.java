package desginpattern.prototype.improve.serialize;

import java.io.Serializable;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/29 21:27
 */
public class DeepCloneTarget implements Serializable {
    public final long serialVersionUID=1L;
    private String id;

    public DeepCloneTarget(String id) {
        this.id = id;
    }
}




