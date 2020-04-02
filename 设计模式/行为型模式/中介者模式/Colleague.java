package 设计模式.行为型模式.中介者模式;

/**
 * 抽象同事类
 */
public abstract class Colleague {

    protected Mediator mediator;

    void setMedium(Mediator mediator){
        this.mediator = mediator;
    }

    abstract void receive();
    abstract void send();

}
