package 设计模式.行为型模式.访问者模式.例;

/**
 * 具体访问者  造币公司
 */
public class MintCompany implements Company {

    @Override
    public void create(Paper element) {
        System.out.println("访问造币公司----纸可以造纸币");
    }

    @Override
    public void create(Cuprum element) {
        System.out.println("访问造币公司----铜可以造铜币");
    }
}
