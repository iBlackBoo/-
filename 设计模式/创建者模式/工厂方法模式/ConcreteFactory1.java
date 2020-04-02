package 设计模式.创建者模式.工厂方法模式;

/**
 * 具体工厂1，实现产品生成的工厂
 */
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("具体工厂1生成———>具体产品1");
        return new ConcreteProduct1();
    }
}
