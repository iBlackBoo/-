package 设计模式.行为型模式.中介者模式;

/**
 * 具体同事类 1
 */
public class ConcreteColleague1 extends Colleague {
    @Override
    void receive() {
        System.out.println("具体同事类1收到请求...");
    }

    @Override
    void send() {
        System.out.println("具体同事类1发出请求...");
        super.mediator.relay(this);
    }
}
