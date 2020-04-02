package 设计模式.创建者模式.建造者模式;

/**
 * 指挥者，调用建造者中的方法完成复杂对象的创建
 */
public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }

    public Product construct(){
        builder.builderPartA();
        builder.builderPartB();
        builder.builderPartC();
        return builder.getResult();
    }
}
