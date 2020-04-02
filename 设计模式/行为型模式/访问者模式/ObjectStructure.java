package 设计模式.行为型模式.访问者模式;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 对象结构角色
 */
public class ObjectStructure {

    private List<Element> list = new ArrayList<>();

    void accept(Visitor visitor){
        Iterator<Element> iterator = list.iterator();
        while (iterator.hasNext()){
            ((Element)iterator.next()).accept(visitor);
        }
    }

    void add(Element element){
        list.add(element);
    }

    void remove(Element element){
        list.remove(element);
    }

}
