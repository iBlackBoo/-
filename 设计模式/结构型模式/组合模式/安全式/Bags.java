package 设计模式.结构型模式.组合模式.安全式;

import java.util.ArrayList;
import java.util.List;

/**
 * 数枝构件，袋子
 */
public class Bags implements Articles {

    private String name;//名字
    private List<Articles> bags = new ArrayList<>();

    public Bags(String name) {
        this.name = name;
    }

    public void add(Articles c){
        bags.add(c);
    }

    public Articles getChild(int i){
        return bags.get(i);
    }

    @Override
    public float calculation() {
        float s = 0;
        for (Object obj : bags) {
            s += ((Articles)obj).calculation();
        }
        return s;
    }

    @Override
    public void show() {
        for(Object obj:bags){
            ((Articles)obj).show();
        }
    }
}
