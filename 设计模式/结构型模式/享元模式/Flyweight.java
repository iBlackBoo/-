package 设计模式.结构型模式.享元模式;

/**
 * 抽象享元角色
 */
public interface Flyweight {

    void operation(UnsharedConcreteFlyweight state);

}
