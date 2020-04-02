package 设计模式.结构型模式.享元模式;


/**
 * 具体享元模式
 */
public class ConcreteFlyweight implements Flyweight {

    private String key;

    ConcreteFlyweight(String key){
        this.key = key;
        System.out.println("具体享元" + key + "被创建");
    }

    @Override
    public void operation(UnsharedConcreteFlyweight state) {
        System.out.println("具体享元" + key + "被调用");
        System.out.println("非享元信息是："+state.getInfo());
    }

}
