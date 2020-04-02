package 设计模式.行为型模式.访问者模式.例;

/**
 * 抽象访问者公司
 */
public interface Company {

    void create(Paper element);//纸
    void create(Cuprum element);//铜

}
