package Demo2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Demo2
 *
 * @author yuhl
 * @date 2022/1/14
 *
 * 1、增强for循环，无索引
 *
 */
public class ForEachDemo {
    public static void main(String[] args) {

        ArrayList aa1 =new ArrayList();
        for(int i=0;i<1000;i++){
            aa1.add(i);
        }


        long start = System.currentTimeMillis();

        for (Object ii :aa1){
            System.out.println(ii);
        }
        long finish = System.currentTimeMillis();
        System.out.println("耗时"+(finish-start));
    }

}
