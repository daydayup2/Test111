package ThreadDemo;

/**
 * ThreadDemo
 *
 * @author yuhl
 * @date 2022/1/25
 * 方法二 1、实现Runnable 接口 重写run 抽象方法
 */
public class ThreadDemo2 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
