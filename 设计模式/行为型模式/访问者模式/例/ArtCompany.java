package 设计模式.行为型模式.访问者模式.例;

/**
 * 具体访问者  艺术公司
 */
public class ArtCompany implements Company {
    @Override
    public void create(Paper element) {
        System.out.println("访问艺术公司----纸可以画图");
    }

    @Override
    public void create(Cuprum element) {
        System.out.println("访问艺术公司----铜可以铸造");
    }
}
