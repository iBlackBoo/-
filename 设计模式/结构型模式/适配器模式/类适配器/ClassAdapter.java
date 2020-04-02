package 设计模式.结构型模式.适配器模式.类适配器;

/**
 * 类适配器
 */
public class ClassAdapter extends Adapter implements Target {
    @Override
    public void request() {
        specificRequest();
    }
}
