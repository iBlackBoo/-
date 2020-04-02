package 设计模式.创建者模式.抽象工厂模式;

/**
 * 具体工厂2
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public Product1 newProduct1() {
        System.out.println("具体工厂 2 生成-->具体产品 11...");
        return new ConcreteProduct1();
    }

    @Override
    public Product2 newProduct2() {
        System.out.println("具体工厂 2生成-->具体产品 21...");
        return new ConcreteProduct2();
    }
}
