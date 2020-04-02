package 设计模式.行为型模式.观察者模式;

public class ObserverTest {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        ConcreteObserver1 concreteObserver1 = new ConcreteObserver1();
        ConcreteObserver2 concreteObserver2 = new ConcreteObserver2();
        concreteSubject.add(concreteObserver1);
        concreteSubject.add(concreteObserver2);
        concreteSubject.notifyObserver();
    }
}
