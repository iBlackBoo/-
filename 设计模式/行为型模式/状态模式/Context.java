package 设计模式.行为型模式.状态模式;

/**
 * 环境类
 */
public class Context {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Context() {
        this.state = new ConcreteStateA();
    }

    void Handle(){
        state.Handle(this);
    }

}
