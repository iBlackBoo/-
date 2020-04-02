package 设计模式.行为型模式.状态模式.例;

/**
 * 抽象状态类
 */
public abstract class State {
    protected ScoreContext scoreContext;//环境
    protected String stateName;//状态名
    protected int score;//分数

    abstract void checkScore();//检查当前状态

    void addScore(int score) {
        this.score += score;
        System.out.print((score > 0?"加上：":"减去：")+ score + "分，当前分数：" + this.score);
        checkScore();
        System.out.println("，当前状态" + scoreContext.getState().stateName);
    }

}
