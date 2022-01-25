package ThreadDemo;

/**
 * ThreadDemo
 *
 * @author yuhl
 * @date 2022/1/25
 * 一、创建线程的五种方法
 *    1、继承Thread类
 *    2、实现runable 接口 重写run
 */
public class ThreadDemo1 extends Thread {
    @Override
    public void run() {
        for(int i=0;i<10;i++){
           System.out.println(Thread.currentThread().getName()+i);
        }
    }
}

