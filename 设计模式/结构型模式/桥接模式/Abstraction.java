package 设计模式.结构型模式.桥接模式;

/**
 * 抽象化角色
 */
public abstract class Abstraction {
    protected Implementor implementor;

    protected Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void Operation();
}
