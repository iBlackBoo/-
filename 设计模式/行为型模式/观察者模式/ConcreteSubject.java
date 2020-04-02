package 设计模式.行为型模式.观察者模式;


/**
 * 具体目标
 */
public class ConcreteSubject extends Subject {
    @Override
    void notifyObserver() {
        System.out.println("具体目标发生变化");
        for (Observer ob: super.observers) {
            ((Observer)ob).response();
        }
    }
}
