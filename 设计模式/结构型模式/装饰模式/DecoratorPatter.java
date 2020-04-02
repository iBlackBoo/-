package 设计模式.结构型模式.装饰模式;

public class DecoratorPatter {
    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        concreteComponent.operation();
        System.out.println("---------------");
        ConcreteDecorator concreteDecorator = new ConcreteDecorator(concreteComponent);
        concreteDecorator.operation();
    }
}
