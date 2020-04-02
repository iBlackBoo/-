package 设计模式.行为型模式.观察者模式;

/**
 * 具体观察者2
 */
public class ConcreteObserver2 implements Observer {
    @Override
    public void response() {
        System.out.println("具体观察者2做出反应...");
    }
}
