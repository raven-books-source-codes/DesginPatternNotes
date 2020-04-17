package desginpattern.responsiblitychain;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/17 14:56
 */
public class TeachingDirector extends Handler{
    @Override
    public void processRequest(Request request) {
        if(request.getPrice() < 5000){
            System.out.println("教学主任已处理");
        }else{
            handler.processRequest(request);
        }
    }
}
