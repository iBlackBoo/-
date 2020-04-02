package 设计模式.行为型模式.状态模式.例;

/**
 * 环境类
 */
public class ScoreContext {

    private State state;

    public ScoreContext() {
        state = new LowState(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    void add(int score){
        this.state.addScore(score);
    }
}
