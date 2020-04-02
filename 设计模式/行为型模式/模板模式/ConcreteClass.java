package 设计模式.行为型模式.模板模式;

/**
 * 具体子类
 */
public class ConcreteClass extends AbstractClass {

    @Override
    void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }

    @Override
    void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }
}
