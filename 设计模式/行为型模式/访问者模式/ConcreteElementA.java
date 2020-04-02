package 设计模式.行为型模式.访问者模式;

/**
 * 具体元素A类
 */
public class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }

    String operationA(){
        return "具体元素A的操作";
    }
}
