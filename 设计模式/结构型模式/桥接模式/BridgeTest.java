package 设计模式.结构型模式.桥接模式;

public class BridgeTest {
    public static void main(String[] args) {
        ConcreteImplementorA concreteImplementorA = new ConcreteImplementorA();
        RefinedAbstraction refinedAbstraction = new RefinedAbstraction(concreteImplementorA);
        refinedAbstraction.Operation();
    }
}
