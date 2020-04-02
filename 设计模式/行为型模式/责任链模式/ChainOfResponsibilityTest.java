package 设计模式.行为型模式.责任链模式;

public class ChainOfResponsibilityTest {
    public static void main(String[] args) {
        //组装责任链
        Handler handler1=new ConcreteHandler1();
        Handler handler2=new ConcreteHandler2();
        handler1.setNext(handler2);
        //提交请求
        handler1.handlerRequest("two");
    }
}
