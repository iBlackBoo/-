package 设计模式.创建者模式.抽象工厂模式;


/**
 * 具体产品1，实现抽象产品中的抽象方法
 */
public class ConcreteProduct1 implements Product1 {
    @Override
    public void ConcreteProduct1() {
        System.out.println("具体产品1具体实现");
    }
}
