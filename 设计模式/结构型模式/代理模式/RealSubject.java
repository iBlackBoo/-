package 设计模式.结构型模式.代理模式;

/**
 * 真实主题
 */
public class RealSubject implements Subject {
    @Override
    public void Request() {
        System.out.println("访问真实主题...");
    }
}
