package 设计模式.行为型模式.访问者模式;

public class VisitorTest {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new ConcreteElementA());
        objectStructure.add(new ConcreteElementB());
        Visitor visitor = new ConcreteVisitorA();
        objectStructure.accept(visitor);
        System.out.println("---------------------");
        visitor = new ConcreteVisitorB();
        objectStructure.accept(visitor);
    }
}
