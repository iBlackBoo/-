package 设计模式.行为型模式.解释器模式;

/**
 * 对非终结符表达式类
 */
public class NonterminalExpression implements AbstractExpression {
    @Override
    public Object interpret(String info) {
        System.out.println("对非终结符表达式的处理...");
        return null;
    }
}
