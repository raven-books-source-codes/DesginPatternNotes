package desginpattern.responsiblitychain;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/17 14:59
 */
public class Dean  extends Handler{
    @Override
    public void processRequest(Request request) {
        if(request.getPrice() <= 10000 && request.getPrice() >5000){
            System.out.println("院长已处理");
        }else{
            handler.processRequest(request);
        }
    }
}
