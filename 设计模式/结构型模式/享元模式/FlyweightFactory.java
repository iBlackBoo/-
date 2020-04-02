package 设计模式.结构型模式.享元模式;

import java.util.HashMap;

/**
 * 享元工厂角色
 */
public class FlyweightFactory {

    private HashMap<String, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = this.flyweights.get(key);
        if(flyweight != null){
            System.out.println("具体享元" + key + "已经存在，被成功获取！");
        }else{
            flyweight = new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
        }

        return flyweight;
    }
}
