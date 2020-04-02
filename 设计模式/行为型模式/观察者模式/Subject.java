package 设计模式.行为型模式.观察者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象目标
 */
public abstract class Subject {

    protected List<Observer> observers = new ArrayList<>();

    /**
     * 增加观察者方法
     * @param observer
     */
    void add(Observer observer){
        observers.add(observer);
    }

    /**
     * 删除观察者方法
     * @param observer
     */
    void remove(Observer observer){
        observers.remove(observer);
    }

    //通知观察者方法
    abstract void notifyObserver();

}
