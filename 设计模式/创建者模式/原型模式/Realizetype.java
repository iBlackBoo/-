package 设计模式.创建者模式.原型模式;

import java.io.*;

/**
 * 原型模式
 * 原型模式的克隆分为浅克隆和深克隆，Java 中的 Object 类提供了浅克隆的 clone() 方法，
 * 具体原型类只要实现 Cloneable 接口就可实现对象的浅克隆，这里的 Cloneable 接口就是抽象原型类
 */
public class Realizetype implements Cloneable,Serializable {

    private Persion persion;

    public Persion getPersion() {
        return persion;
    }

    public void setPersion(Persion persion) {
        this.persion = persion;
    }
    Realizetype(Persion persion){
        this.persion = persion;
        System.out.println("具体原型创建成功" + persion);
    }
    @Override
    protected Realizetype clone(){
        Realizetype realizetype = null;
        try {
            realizetype = (Realizetype)super.clone();
            realizetype.setPersion(this.persion.clone());
            System.out.println("具体原型复制成功");
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return realizetype;
    }

    public Realizetype deepClone() {
        Realizetype realizetype = null;
       try {
           //将对象写入流中
           ByteArrayOutputStream bao=new ByteArrayOutputStream();
           ObjectOutputStream oos=new ObjectOutputStream(bao);
           oos.writeObject(this);
           //将对象从流中取出
           ByteArrayInputStream bis=new ByteArrayInputStream(bao.toByteArray());
           ObjectInputStream ois=new ObjectInputStream(bis);
           realizetype =  (Realizetype)(ois.readObject());
       }catch (Exception e){
           e.printStackTrace();
       }finally {
           return realizetype;
       }
    }
}
