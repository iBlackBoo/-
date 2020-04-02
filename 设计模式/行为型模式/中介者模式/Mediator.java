package 设计模式.行为型模式.中介者模式;

/**
 * 抽象中介者
 */
public abstract class Mediator {

    abstract void register(Colleague colleague);
    abstract void relay(Colleague colleague);//转发
}
