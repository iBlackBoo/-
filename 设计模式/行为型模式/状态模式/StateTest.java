package 设计模式.行为型模式.状态模式;

public class StateTest {
    public static void main(String[] args) {
        Context context=new Context();    //创建环境
        context.Handle();    //处理请求
        context.Handle();
        context.Handle();
        context.Handle();
    }
}
