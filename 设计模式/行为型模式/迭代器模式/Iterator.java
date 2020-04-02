package 设计模式.行为型模式.迭代器模式;

/**
 * 抽象迭代器
 */
public interface Iterator {

    Object first();
    Object next();
    boolean hasNext();

}
