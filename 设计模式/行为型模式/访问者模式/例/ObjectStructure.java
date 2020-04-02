package 设计模式.行为型模式.访问者模式.例;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

    private List<Element> list = new ArrayList<>();

    void add(Element company){
        list.add(company);
    }

    void remove(Element company){
        list.remove(company);
    }

    void accept(Company company){
        for (Element c:list) {
            c.accept(company);
        }
    }

}
