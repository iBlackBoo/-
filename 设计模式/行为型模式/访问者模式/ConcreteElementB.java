package 设计模式.行为型模式.访问者模式;

public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }

    String operationB(){
        return "具体元素B的操作";
    }
}
