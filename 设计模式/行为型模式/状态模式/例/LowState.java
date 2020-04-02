package 设计模式.行为型模式.状态模式.例;

/**
 * 具体状态类，不及格
 */
public class LowState extends State {

    public LowState(ScoreContext scoreContext) {
        super.scoreContext = scoreContext;
        super.stateName = "不及格";
        super.score = 0;
    }

    public LowState(State state) {
        super.scoreContext = state.scoreContext;
        super.stateName = "不及格";
        super.score = state.score;
    }

    @Override
    void checkScore() {
        if(super.score >= 90){
            super.scoreContext.setState(new HighState(this));
        }else if(super.score >= 60){
            super.scoreContext.setState(new MiddleState(this));
        }
    }
}
