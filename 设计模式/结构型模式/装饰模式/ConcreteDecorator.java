package 设计模式.结构型模式.装饰模式;

/**
 * 具体装饰角色
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    public void operation(){
        super.operation();
        addedFunction();
    }

    protected void addedFunction(){
        System.out.println("为具体构件角色增加额外的功能addedFunction()");
    }

}
