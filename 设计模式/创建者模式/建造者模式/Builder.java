package 设计模式.创建者模式.建造者模式;

/**
 * 抽象建造者，包含创建产品各个子部件的抽象方法
 */
public abstract class Builder {
    //创建产品对象
    protected Product product = new Product();
    public abstract void builderPartA();
    public abstract void builderPartB();
    public abstract void builderPartC();
    //返回产品对象
    public Product getResult(){
        return product;
    }
}
