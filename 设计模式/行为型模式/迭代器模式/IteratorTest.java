package 设计模式.行为型模式.迭代器模式;

public class IteratorTest {
    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        concreteAggregate.add("中山大学");
        concreteAggregate.add("华南理工");
        concreteAggregate.add("清华大学");
        System.out.println("聚合内容：");
        Iterator iterator = concreteAggregate.getIterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
        Object first = iterator.first();
        System.out.println("first"+first);

    }
}
