package 设计模式.行为型模式.状态模式.例;

public class ScoreTest {
    public static void main(String[] args) {
        ScoreContext scoreContext = new ScoreContext();
        scoreContext.add(10);
        scoreContext.add(-10);
        scoreContext.add(100);
        scoreContext.add(-20);
    }
}
