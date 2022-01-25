package Queue.DelayQueueDemo;

import java.util.Random;
import java.util.concurrent.DelayQueue;

/**
 * Demo3.DelayQueueDemo
 *
 * @author yuhl
 * @date 2022/1/20
 */
public class DelayQueueTest extends Thread {
    private static DelayQueue delayQueue = new DelayQueue();

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
               // 必须添加我们自己的实现了Delayed接口的类的对象
                delayQueue.offer(new DelayQueueDemo("task1", new Random().nextInt(10000)));
                delayQueue.offer(new DelayQueueDemo("task2", 1000));
                delayQueue.offer(new DelayQueueDemo("task3", new Random().nextInt(10000)));
                delayQueue.offer(new DelayQueueDemo("task4", 3000));
                delayQueue.offer(new DelayQueueDemo("task5", new Random().nextInt(10000)));

            }
        }).start();
        while (true){
            try {
                DelayQueueDemo delayQueueDemo = (DelayQueueDemo) delayQueue.take();
                System.out.println(delayQueueDemo.getName()+":"+delayQueueDemo.getTime());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }


}
