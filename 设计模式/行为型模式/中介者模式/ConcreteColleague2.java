package 设计模式.行为型模式.中介者模式;

/**
 * 具体同事类2
 */
public class ConcreteColleague2 extends Colleague{
    @Override
    void receive() {
        System.out.println("具体同事类2收到请求...");
    }

    @Override
    void send() {
        System.out.println("具体同事类2发送请求...");
        super.mediator.relay(this);
    }
}
