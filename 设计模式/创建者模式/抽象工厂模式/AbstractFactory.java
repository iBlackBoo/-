package 设计模式.创建者模式.抽象工厂模式;



/**
 * 抽象工厂：提供了产品的生成方法
 */
public interface AbstractFactory {
    public Product1 newProduct1();
    public Product2 newProduct2();
}
