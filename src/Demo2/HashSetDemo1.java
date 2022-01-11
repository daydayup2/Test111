package Demo2;

import java.util.HashSet;

/**
 * Demo2
 *
 * @author yuhl
 * @date 2022/1/6
 * HashSet 特性
 * Set 无序的 不重复的 只能有一个null
 * Set 有两个实现类 hashset treeset
 */
public class HashSetDemo1 {
    public static void main(String[] args) {
        HashSet<String> s1 =new HashSet();
        s1.add("张三");
        s1.add("李四");
        s1.add("王五");
        s1.add("王五");//不可重复 指挥保存一个王五
        for(String name:s1){ //声明name 每次去接收
            System.out.println(name); //循环打印是无序的 和添加的顺序不一样，
        }
        System.out.println(s1.size());
    }
}
