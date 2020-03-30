package desginpattern.builder;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/3/30 19:40
 */
public class Client {
    public static void main(String[] args) {
      ComputerBuilder cb = new HighComputerBuilder();
      Director director = new Director(cb);
      Computer computer = director.build();
      System.out.println(computer);
    }
}
