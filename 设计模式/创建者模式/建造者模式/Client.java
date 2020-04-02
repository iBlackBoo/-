package 设计模式.创建者模式.建造者模式;

public class Client {
    public static void main(String[] args) {
        Builder builder = new ContreteBuiler();
        Director director = new Director(builder);
        Product construct = director.construct();
        System.out.println(construct.show());
    }
}
