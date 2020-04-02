package 设计模式.结构型模式.桥接模式;

/**
 * 扩展抽象化角色
 */
public class RefinedAbstraction extends Abstraction {

    protected RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void Operation() {
        System.out.println("扩展抽象化（Refined Abstraction）角色被访问");
        implementor.OperationImpl();
    }
}
