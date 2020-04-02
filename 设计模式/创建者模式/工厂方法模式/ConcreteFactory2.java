package 设计模式.创建者模式.工厂方法模式;

/**
 * 具体工厂2，实现产品的工厂
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("具体工厂2生成———>具体产品2");
        return new ConcreteProduct2();
    }
}
