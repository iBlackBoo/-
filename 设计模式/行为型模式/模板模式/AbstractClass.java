package 设计模式.行为型模式.模板模式;

/**
 * 抽象类
 */
public abstract class AbstractClass {

    /**
     * 模板方法
     */
    void TemplateMethod(){
        SpecificMethhod();
        abstractMethod1();
        abstractMethod2();
    }

    /**
     * 具体方法
     */
    void SpecificMethhod(){
        System.out.println("抽象类中的具体方法被调用...");
    }

    abstract void abstractMethod1(); //抽象方法1
    abstract void abstractMethod2(); //抽象方法2

}
