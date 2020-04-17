package desginpattern.responsiblitychain;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/17 15:03
 */
public class Client {
    public static void main(String[] args) {
        // 定义请求
        Request request = new Request(300000);
        // 定义职责node
        Handler defaultHandler = new DefaultHandler();
        Handler teachingDirector = new TeachingDirector();
        Handler dean = new Dean();
        Handler vicePrincipal = new VicePrincipal();
        Handler principal = new Principal();
        // 形成职责链
        teachingDirector.setHandler(dean);
        dean.setHandler(vicePrincipal);
        vicePrincipal.setHandler(principal);
        principal.setHandler(defaultHandler);
        Handler firstNode = teachingDirector;
        // 处理请求
        firstNode.processRequest(request);
    }
}
