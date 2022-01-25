package Queue.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

/**
 * Demo3.PriorityQueue
 *
 * @author yuhl
 * @date 2022/1/19
 * PriorityQueue优先级队列既可以根据元素的自然顺序来排序，也可以根据Comparator来设置排序规则。
 * PriorityQueue优先级队列对于自定义的类来说，需要自定义比较器。
 * PriorityQueue优先队列的大小是不受限制的，但在创建时可以指定初始大小。当我们向优先队列增加元素的时候，队列大小会自动增加。
 * PriorityQueue优先队列不允许空值。
 * PriorityQueue是非线程安全的，所以Java提供了PriorityBlockingQueue在多线程环境使用。
 */
public class Test2 {
    public static void main(String[] args) {
        PriorityQueue<People> p1 = new PriorityQueue<>(11, new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                return o1.age - o2.age;
            }
        });
        for (int i = 0; i < 10; i++) {
            p1.add(new People("李" + i, new Random().nextInt(100)));
        }
        while (!p1.isEmpty()) {//当不为空就取元素，为空跳出
            System.out.println(p1.poll().toString() + p1.isEmpty());

        }


    }
}
