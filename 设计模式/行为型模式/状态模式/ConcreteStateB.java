package 设计模式.行为型模式.状态模式;

/**
 * 具体状态B类
 */
public class ConcreteStateB extends State {
    @Override
    void Handle(Context context) {
        System.out.println("当前状态是 B. ");
        context.setState(new ConcreteStateA());
    }
}
