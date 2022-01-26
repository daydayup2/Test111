package ThreadDemo;

/**
 * ThreadDemo
 *
 * @author yuhl
 * @date 2022/1/26
 * <p>
 * <p>
 * Runnable和Thread比较
 * 继承和实现接口的区别
 */
public class qubie {
    public static void main(String[] args) {

        /**Thread不做资源共享写法*/
//        MyThread t1 = new MyThread();
//        MyThread t2 = new MyThread();
//        t1.start();
//        t2.start();

        /**Thread能资源共享写法*/
//        Thread也可以做资源共享，但不适合作资源共享，本质依然是用的runable 具体查看Thread(t1,"线程1")源码
        //因为多线程访问同一变量会有并发问题（需要加锁） MyThread里
//        MyThread t1=new MyThread();
//        new Thread(t1,"线程1").start();
//        new Thread(t1,"线程2").start();


        /**Runnable能资源共享写法*/
//        方法二 实现Runnable
        MyThread t3 = new MyThread();
        Thread thread1 = new Thread(t3, "窗口1");//共用同一个资源t3
        Thread thread2 = new Thread(t3, "窗口2");
        Thread thread3 = new Thread(t3, "窗口3");
        thread2.setPriority(10);//设置优先级 1-10  默认5 只是增加概率，但是低优先级任有机会
        thread1.setPriority(1);
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
;