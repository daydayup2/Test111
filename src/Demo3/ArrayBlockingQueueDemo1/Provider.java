package Demo3.ArrayBlockingQueueDemo1;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Demo3
 *
 * @author yuhl
 * @date 2022/1/19
 * 1 Provider 继承Thread 线程 插入元素
 */
public class Provider extends Thread { //生产者

    ArrayBlockingQueue<Integer> a1;
    int queSize;

    public Provider(ArrayBlockingQueue a1, int queSize) {
        this.a1 = a1;
        this.queSize = queSize;
    }

    public void provide() {
        while (true) {

            try {
                synchronized (this) {

                    a1.put(1);
                    System.out.println("插入一个元素，剩余空间" + (queSize - a1.size()));
                }
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        provide();
    }
}

