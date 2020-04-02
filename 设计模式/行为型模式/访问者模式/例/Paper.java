package 设计模式.行为型模式.访问者模式.例;


/**
 * 元素 纸
 */
public class Paper implements Element {
    @Override
    public void accept(Company company) {
        company.create(this);
    }
}
