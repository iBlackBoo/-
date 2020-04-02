package 设计模式.结构型模式.桥接模式;

/**
 * 具体实现化角色
 */
public class ConcreteImplementorA implements Implementor {
    @Override
    public void OperationImpl() {
        System.out.println("具体实现化（Concrete Implementor）角色被访问...");
    }
}
