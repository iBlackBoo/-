package 设计模式.行为型模式.策略模式;

/**
 * 具体策略类A
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略A的策略方法被访问！");
    }
}
