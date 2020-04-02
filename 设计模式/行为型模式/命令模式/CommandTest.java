package 设计模式.行为型模式.命令模式;

public class CommandTest {
    public static void main(String[] args) {
        ConcreteCommand concreteCommand = new ConcreteCommand();
        Invoker invoker = new Invoker(concreteCommand);
        System.out.println("客户访问调用者的call()方法...");
        invoker.call();
    }
}
