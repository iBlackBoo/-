package 设计模式.创建者模式.单例模式;

/**
 * 单例模式
 */
public class Singleton {

    /**
     * 懒汉式模式
     * 如果编写的是多线程程序，则不要删除代码中的关键字 volatile 和 synchronized，
     * 否则将存在线程非安全的问题。如果不删除这两个关键字就能保证线程安全，
     * 但是每次访问时都要同步，会影响性能，且消耗更多的资源，这是懒汉式单例的缺点。
     */
    class LazySingleton{
        private volatile LazySingleton instance = null;  //保证 instance 在所有线程中同步
        private LazySingleton(){

        }
        public synchronized LazySingleton getInstance(){
            if(instance == null){ //getInstance 方法前加同步
                instance = new LazySingleton();
            }
            return instance;
        }
    }

    /**
     * 饿汉式模式
     * 饿汉式单例在类创建的同时就已经创建好一个静态的对象供系统使用，
     * 以后不再改变，所以是线程安全的，可以直接用于多线程而不会出现问题。
     */
    class HungrySingleton{
        private volatile HungrySingleton instance = new HungrySingleton();
        private HungrySingleton(){
        }
        public synchronized HungrySingleton getInstance(){
            return instance;
        }
    }

}
