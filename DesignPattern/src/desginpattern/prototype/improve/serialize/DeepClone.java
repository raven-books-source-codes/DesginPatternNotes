package desginpattern.prototype.improve.serialize;

import java.io.*;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/29 21:27
 */
public class DeepClone implements Serializable {
    public final long serialVersionUID = 1L;

    private String name;
    private DeepCloneTarget deepCloneTarget;

    public DeepCloneTarget getDeepCloneTarget() {
        return deepCloneTarget;
    }

    public DeepClone(String name, DeepCloneTarget deepCloneTarget) {
        this.name = name;
        this.deepCloneTarget = deepCloneTarget;
    }

    public DeepClone deepClone() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        Object obj = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            // bos.toByteArray()一定要在oos.write之后
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            obj = ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
                bis.close();

                oos.close();
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return (DeepClone) obj;
    }
}
