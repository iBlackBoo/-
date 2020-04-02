package 设计模式.行为型模式.访问者模式.例;

public class Test {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new Paper());
        objectStructure.add(new Cuprum());
        objectStructure.accept(new ArtCompany());
        objectStructure.accept(new MintCompany());
    }
}
