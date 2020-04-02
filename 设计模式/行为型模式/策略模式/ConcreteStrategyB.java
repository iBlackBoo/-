package 设计模式.行为型模式.策略模式;

/**
 * 具体策略类B
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略B的策略方法被访问！");
    }
}
