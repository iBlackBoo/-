package 设计模式.创建者模式.建造者模式;

/**
 * 具体建造者，实现了抽象建造者接口
 */
public class ContreteBuiler extends Builder {
    @Override
    public void builderPartA() {
        product.setPartA("建造 PartA");
    }

    @Override
    public void builderPartB() {
        product.setPartB("建造 PartB");
    }

    @Override
    public void builderPartC() {
        product.setPartC("建造 PartC");
    }
}
