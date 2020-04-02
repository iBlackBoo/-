package 设计模式.结构型模式.享元模式;

public class FlyweightPattern {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight f01 = factory.getFlyweight("a");
        Flyweight f02 = factory.getFlyweight("a");
        Flyweight f03 = factory.getFlyweight("a");
        Flyweight f04 = factory.getFlyweight("b");
        Flyweight f05 = factory.getFlyweight("b");
        f01.operation(new UnsharedConcreteFlyweight("1次调用a"));
        f02.operation(new UnsharedConcreteFlyweight("2次调用a"));
        f03.operation(new UnsharedConcreteFlyweight("3次调用a"));
        f04.operation(new UnsharedConcreteFlyweight("1次调用b"));
        f05.operation(new UnsharedConcreteFlyweight("2次调用b"));
    }
}
