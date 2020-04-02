package 设计模式.行为型模式.访问者模式.例;

/**
 * 元素  铜
 */
public class Cuprum implements Element {
    @Override
    public void accept(Company company) {
        company.create(this);
    }
}
