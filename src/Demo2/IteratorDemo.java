package Demo2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Demo2
 *
 * @author yuhl
 * @date 2022/1/13
 *
 * 1、迭代器
 * 2、遍历集合速度快
 * 3、有索引 可以对集合操作增删改查
 *
 */
public class IteratorDemo {
    public static void main(String[] args) {

        ArrayList a1 =new ArrayList();
        for(int i=0;i<1000;i++){
            a1.add(i);
        }

        Iterator i1= a1.iterator();
        long start = System.currentTimeMillis();
        while (i1.hasNext()){
        System.out.println(i1.next());
        }
        long finish = System.currentTimeMillis();
        System.out.println("耗时"+(finish-start));
    }
}
