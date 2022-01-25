package Queue.ArrayBlockingQueueDemo1;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Demo3.ArrayBlockingQueueDemo1
 *
 * @author yuhl
 * @date 2022/1/19
 * <p>
 * 1 Consumer 继承Thread 线程 使用元素
 */
public class Consumer extends Thread {//消费者

    ArrayBlockingQueue<Integer> a1;


    public Consumer(ArrayBlockingQueue<Integer> a1) {
        this.a1 = a1;

    }

    public void consumer() {
        while (true) {

            try {
                Thread.sleep(3000);
                a1.take();
                System.out.println("使用一个元素，还剩余"+ a1.size()+"元素");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        consumer();
    }
}
