package desginpattern.responsiblitychain;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/17 15:02
 */
public class DefaultHandler extends Handler{
    @Override
    public void processRequest(Request request) {
        System.out.println("默认处理");
    }
}
