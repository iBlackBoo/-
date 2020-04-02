package 设计模式.行为型模式.迭代器模式;

/**
 * 抽象聚合
 */
public interface Aggregate {

    void add(Object obj);
    void remove(Object obj);
    Iterator getIterator();

}
