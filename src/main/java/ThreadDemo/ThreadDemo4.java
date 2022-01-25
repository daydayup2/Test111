package ThreadDemo;

import java.util.Date;
import java.util.TimerTask;

/**
 * ThreadDemo
 *
 * @author yuhl
 * @date 2022/1/25
 *
 * 方法四 1、继承TimerTask,定时任务
 */
public class ThreadDemo4 extends TimerTask {


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+new Date());
    }
}
