package 设计模式.行为型模式.状态模式.例;

/**
 * 具体状态类，优秀
 */
public class HighState extends State {

    public HighState(State state) {
        super.scoreContext = state.scoreContext;
        super.stateName = "优秀";
        super.score = state.score;
    }

    @Override
    void checkScore() {
        if(super.score < 60){
            super.scoreContext.setState(new LowState(this));
        }else if(super.score < 90){
            super.scoreContext.setState(new MiddleState(this));
        }
    }
}
