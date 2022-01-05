package Demo1.Test14.Singleton;

/**
 * Demo1.Test14
 *
 * @author yuhl
 * @date 2021/12/17
 */
public class Test14 {
    public static void main(String[] args) {
        //懒汉式加载
        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();
        //Singleton s3= new Singleton(); 构造器私有化了
        System.out.println(s1 == s2);

        //饿汉式加载
        Singleton2 s3 = Singleton2.getsingleton2();
        Singleton2 s4 = Singleton2.getsingleton2();
        System.out.println(s3 == s4);

    }
}
