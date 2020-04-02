package 设计模式.行为型模式.解释器模式;

/**
 * 环境类
 */
public class Context {

    private AbstractExpression expression;

    public Context() {//数据初始化
    }

    void operation(String info){
        System.out.println("调用相关表达式类的解释方法");
    }
}
