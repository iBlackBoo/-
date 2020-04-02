package 设计模式.行为型模式.迭代器模式;

import java.util.List;

/**
 * 具体迭代器
 */
public class ConcreteIterator implements Iterator {

    private List<Object> list = null;
    private int index = -1;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public Object first() {
        this.index = 0;
        return this.list.get(index);
    }

    @Override
    public Object next() {
        Object obj = null;
        if(this.hasNext()){
            obj = this.list.get(++this.index);
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        if(this.index < this.list.size() - 1){
            return true;
        }else{
            return false;
        }
    }
}
