package 设计模式.创建者模式.工厂方法模式;

/**
 * 具体产品2，实现抽象产品中的抽象方法
 */
public class ConcreteProduct2 implements Product {
    @Override
    public void show() {
        System.out.println("具体产品2具体实现");
    }
}
