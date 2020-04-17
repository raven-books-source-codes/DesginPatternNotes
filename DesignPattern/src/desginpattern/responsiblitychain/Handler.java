package desginpattern.responsiblitychain;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/17 14:54
 */
public abstract class Handler {
    // 引用下一个职责node
    protected Handler handler;

    public Handler() {
    }

    public Handler(Handler handler) {
        this.handler = handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public abstract void processRequest(Request request);
}
