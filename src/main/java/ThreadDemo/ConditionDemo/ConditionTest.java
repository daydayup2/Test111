package ThreadDemo.ConditionDemo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ThreadDemo.ConditionDemo
 *
 * @author yuhl
 * @date 2022/2/25
 *  Lock和Condition通信机制：
 *        1.Lock用于控制多线程对需要竞争的共享资源的顺序访问，保证该状态的连续性。
 *        2.Condition是java提供了来实现等待/通知的类，Condition对象是由Lock对象所创建的。
 *        3.Condition中的await（）方法相当于Object的wait（）方法，Condition中的signal（）方法相当于Object的notify（）方法。
 */
public class ConditionTest {
    public static void main(String[] args) {

        //1、创建lock
        Lock lock=new ReentrantLock();
        //监视器
        Condition u= lock.newCondition();

        //执行线程
        UserThread u1=new UserThread(lock,u);
        u1.start();

        //阻塞
        lock.lock();
        System.out.println(Thread.currentThread().getName()+"线程阻塞等待,执行子线程");
        //监视器
        try {
            u.await();
            System.out.println(Thread.currentThread().getName()+"主线程被唤醒"+ u1.getsum());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }


    }
}
