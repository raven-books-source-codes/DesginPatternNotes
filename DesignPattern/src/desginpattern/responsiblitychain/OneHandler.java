package desginpattern.responsiblitychain;

import java.util.function.Predicate;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/17 15:16
 */
public class OneHandler {

    private Predicate<Request> conditon;
    private Handler handler;

    public void setConditon(Predicate<Request> conditon) {
        this.conditon = conditon;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public OneHandler(Predicate<Request> conditon) {
        this.conditon = conditon;
    }

    public void processRequest(Request request){
        if(conditon.test(request)){
            // do something
        }else{
            handler.processRequest(request);
        }
    }
}
