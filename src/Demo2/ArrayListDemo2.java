package Demo2;

import Demo1.Test15.Araay;

import java.util.*;

/**
 * Demo2
 *
 * @author yuhl
 * @date 2022/1/5
 */
public class ArrayListDemo2 {
    public static void main(String[] args) {
        List  list  = Collections.synchronizedList(new ArrayList());
        for(int i=1;i<30;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    int random = (int) (Math.random()*10);
                    list.add(random);
                    System.out.println(list);
                }
            }).start();

}
    }

}
