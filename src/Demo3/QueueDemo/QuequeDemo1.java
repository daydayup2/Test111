package Demo3.QueueDemo;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Demo3
 *
 * @author yuhl
 * @date 2022/1/19
 * 1、queue 队列，先进先出
 * 2、poll去除头元素，第一个元素
 * 3、foreach 遍历
 */
public class QuequeDemo1 {
    public static void main(String[] args) {
        Queue <String>  q1=new LinkedList<String>();
        q1.offer("1");
        q1.offer("2");
        q1.offer("3");
        q1.offer("4");

        String a=q1.poll();
        System.out.println("取出第一个元素"+a);
        for(String B:q1){
            System.out.println("剩余元素"+B);
        }
    }
}
