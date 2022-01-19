package Demo3.ArrayBlockingQueueDemo1;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Demo3.ArrayBlockingQueueDemo1
 *
 * @author yuhl
 * @date 2022/1/19
 * ArrayBlockingQueue基于数组实现的一个阻塞队列，
 * 在创建ArrayBlockingQueue对象时必须制定容量大小。
 * * ArrayBlockingQueue可以指定公平性与非公平性，默认情况下为非公平的，即不保证等待时间最长的队列最优先能够访问队列。
 * * <p>
 * * ArayBlockingQueue常用方法：
 * * 1.put方法用来向队尾存入元素，如果队列满，则等待。
 * * 2.take方法用来从队首取元素，如果为空，则等待
 * * 3.offer方法用来向队尾存入元素，如果队列满，则等待一定的时间，当时间期限达到时，如果还没有插入成功，则返回false；否则返回true。
 * * 4.poll方法用来从队首取元素，如果队列空，则等待一定的时间，当时间期限达到时，如果取不到，则返回null；否则返回取得的元素。
 */
public class Test {
    public static int QueSize = 10;
    private ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(QueSize);

    public static void main(String[] args) {
        Test test=new Test();

        Provider provider = new Provider(test.queue,QueSize);
        Consumer consumer =new Consumer(test.queue);
        provider.start();
        consumer.start();
    }
}
