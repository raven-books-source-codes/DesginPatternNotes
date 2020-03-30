package inversion.improve;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/26 9:54
 */
public class DependencyInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }

}


interface IReceiver{
    String getInfo();
}


class Email implements IReceiver{
    public String getInfo(){
        return "电子邮件";
    }
}

class WeiXin implements IReceiver{

    @Override
    public String getInfo() {
        return "微信";
    }
}

// 方式2
class Person{
    // 这里我们对接口的依赖，所以无需改动
    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}
