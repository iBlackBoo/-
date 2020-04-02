package 设计模式.行为型模式.备忘录模式;

public class MementoTest {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("S0");
        System.out.println("初始状态"+originator.getState());
        caretaker.setMemento(originator.createMemento());//保存状态
        originator.setState("S1");
        System.out.println("新的状态"+originator.getState());
        originator.restoreMemento(caretaker.getMemento());//恢复状态
        System.out.println("恢复之前的状态"+originator.getState());
    }
}
