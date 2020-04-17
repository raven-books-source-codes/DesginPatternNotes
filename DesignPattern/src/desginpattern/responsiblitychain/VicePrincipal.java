package desginpattern.responsiblitychain;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/17 15:00
 */
public class VicePrincipal extends Handler{
    @Override
    public void processRequest(Request request) {
        if(request.getPrice()>10000 && request.getPrice() <= 30000){
            System.out.println("副校长已处理");
        }else{
            handler.processRequest(request);
        }
    }
}
