package desginpattern.bridge;

import java.io.InputStream;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/1 10:45
 */
public class Client {
    public static void main(String[] args) {
        Phone phone1 = new FolderPhone(new Xiaomi());
        phone1.open();
        phone1.close();

        System.out.println("================");
        Phone phone2 = new UpRightPhone(new Vivo());
        phone2.open();
        phone2.close();

    }
}
