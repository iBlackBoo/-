package 设计模式.创建者模式.原型模式;

import java.io.*;

public class Persion implements Cloneable,Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Persion(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Persion clone(){
        Persion persion = null;
        try {
            persion = (Persion)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return persion;
    }
}
