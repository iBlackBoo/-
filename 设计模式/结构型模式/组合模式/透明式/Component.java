package 设计模式.结构型模式.组合模式.透明式;

/**
 * 抽象挂件
 */
public interface Component {

    void add(Component component);

    void remove(Component component);

    Component getChild(int i);

    void operation();

}
