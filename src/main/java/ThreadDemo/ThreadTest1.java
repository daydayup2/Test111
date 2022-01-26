package ThreadDemo;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;
import org.junit.Test;

import java.util.Timer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * ThreadDemo
 *
 * @author yuhl
 * @date 2022/1/25
 */
public class ThreadTest1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

/***************************************************************************/
        //方法一 继承Thread  不适合作资源共享，本质依然是用的runable
//        Thread t1=new ThreadDemo1();
//        Thread t2=new ThreadDemo1();
//        t1.start();
//        t2.start();

        //不适合作资源共享，本质依然是用的runable
//        ThreadDemo1 t1=new ThreadDemo1();
//        new Thread(t1,"线程1").start();
//        new Thread(t1,"线程2").start();

/***************************************************************************/

        //方法二 实现Runnable
//        ThreadDemo2 t3=new ThreadDemo2();
//        new Thread(t3).start();
/***************************************************************************/

        //方法三 实现Runnable
//        ThreadDemo3 t3=new ThreadDemo3();
//        FutureTask t4=new FutureTask(t3);//FutureTask实现了Runnable
//        new Thread(t4).start(); //当作参数传入
//        System.out.println(t4.get());
/***************************************************************************/

        //方法四 继承Timer
//        ThreadDemo4 t4 = new ThreadDemo4();
//        Timer timer = new Timer();
//        timer.schedule(t4, 3000,2000);
/***************************************************************************/

    }

}
