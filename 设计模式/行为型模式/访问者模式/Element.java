package 设计模式.行为型模式.访问者模式;

/**
 * 抽象元素类
 */
public interface Element {

    void accept(Visitor visitor);

}
