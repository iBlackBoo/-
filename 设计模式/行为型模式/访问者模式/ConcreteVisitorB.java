package 设计模式.行为型模式.访问者模式;

/**
 * 具体访问者B
 */
public class ConcreteVisitorB implements Visitor {
    @Override
    public void visitor(ConcreteElementA element) {
        System.out.println("具体访问者A访问-->"+element.operationA());
    }

    @Override
    public void visitor(ConcreteElementB element) {
        System.out.println("具体访问者B访问-->"+element.operationB());
    }
}
