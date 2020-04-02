package 设计模式.行为型模式.访问者模式;

/**
 * 抽象访问者
 */
public interface Visitor {

    void visitor(ConcreteElementA element);
    void visitor(ConcreteElementB element);

}
