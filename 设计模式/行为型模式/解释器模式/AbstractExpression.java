package 设计模式.行为型模式.解释器模式;

/**
 * 抽象表达式类
 */
public interface AbstractExpression {

    Object interpret(String info);//解释方法

}
