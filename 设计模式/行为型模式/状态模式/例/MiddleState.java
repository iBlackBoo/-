package 设计模式.行为型模式.状态模式.例;

/**
 * 具体状态类，及格
 */
public class MiddleState extends State {

    public MiddleState(State state) {
        super.scoreContext = state.scoreContext;
        super.stateName = "及格";
        super.score = state.score;
    }

    @Override
    void checkScore() {
        if(super.score >= 90){
            super.scoreContext.setState(new HighState(this));
        }else if(super.score < 60){
            super.scoreContext.setState(new LowState(this));
        }
    }
}
