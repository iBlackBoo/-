package 设计模式.行为型模式.状态模式;

/**
 * 具体状态A类
 */
public class ConcreteStateA extends State {
    @Override
    void Handle(Context context) {
        System.out.println("当前状态是 A . ");
        context.setState(new ConcreteStateB());
    }
}
