package Test14.Singleton;

/**
 * Test14
 *
 * @author yuhl
 * @date 2021/12/17
 *设计模式————单例模式
 * 1、单例类只能有一个实例。
 * 2、单例类必须自己创建自己的唯一实例。
 * 3、单例类必须给所有其他对象提供这一实例，
 *
 * 单例模式——懒汉模式
 * 方式一：懒汉式，线程安全
 * 是否Lazy初始化；是
 * 是否多线程安全：是
 * 实现难度：易
 * 描述：这种方式具备很好的lazyloading，能够在多线程中很好的工作，但是效率很低，99%情况下不需要同步。
 * 优点：第一次调用才初始化，避免内存浪费。
 * 缺点：必须加锁synchronized才能保证单例，但加锁会影响效率。不过getinstanceO）的性能对应用程序不是很关键（该方法使用不太频繁）。
 */
public class Singleton {
    private static Singleton singleton;

    private  Singleton(){ //构造器私有化，外面不能new 创建了，只能通过给的getSingleton 去创建对象
    }

    public static  synchronized  Singleton getSingleton() {
        if(singleton==null){
            singleton =new Singleton();
        }
        return singleton;
    }
}
