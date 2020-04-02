package 设计模式.创建者模式.原型模式;

/**
 * 原型模式的测试类
 */
public class RealizetypeTest {
    public static void main(String[] args) {
        try {
            Persion persion = new Persion("111");
            Realizetype realizetype = new Realizetype(persion);
            Realizetype clone = realizetype.clone();
            Realizetype realizetype1 = realizetype.deepClone();
            System.out.println(clone.getPersion());
            System.out.println(realizetype1.getPersion());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
