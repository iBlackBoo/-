package 设计模式.结构型模式.适配器模式.对象适配器;

public class ObjectAdapterTest {
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        ObjectAdapter objectAdapter = new ObjectAdapter(adapter);
        objectAdapter.request();
    }
}
