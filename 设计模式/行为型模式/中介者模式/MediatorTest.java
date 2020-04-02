package 设计模式.行为型模式.中介者模式;

public class MediatorTest {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();
        Colleague c1 = new ConcreteColleague1();
        Colleague c2 = new ConcreteColleague2();
        concreteMediator.register(c1);
        concreteMediator.register(c2);
        c1.send();
        c2.send();
    }
}
