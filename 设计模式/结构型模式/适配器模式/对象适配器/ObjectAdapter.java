package 设计模式.结构型模式.适配器模式.对象适配器;

/**
 * 对象适配器类
 */
public class ObjectAdapter implements Target {

    private Adapter adapter;

    public ObjectAdapter(Adapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public void request() {
        adapter.specificRequest();
    }
}
