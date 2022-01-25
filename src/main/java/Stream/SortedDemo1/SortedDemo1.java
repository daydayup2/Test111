package Stream.SortedDemo1;

import org.junit.Test;

import java.io.PrintStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author yuhl
 * @date 2022/1/21
 * 一. Stream 流操作 sorted
 * 1、test3---自然排序   sorted
 * 2、test4---比较器排序  sorted(Comparator.comparing(Student::getAge))
 * 3、test5---limit截取
 * 4、test6---distinct 普通去重
 * 5、test7---distinct 自定义对象去重
 * 8、test8---skip跳过元素
 * 9、test9--- mapTnInt 接受一个函数作为参数，作用于每一个元素
 * 10、test10--count（）,收集器，可以收集为数组
 */
public class SortedDemo1 {


    /**
     * sorted() 自然排序
     */
    @Test
    public void test3() {
        ArrayList<Integer> a1 = new ArrayList();
        a1.add(39);
        a1.add(23);
        a1.add(12);
        a1.add(45);
        a1.add(26);
        a1.add(52);

        //1、自然排序 由小到大
        System.out.println("1、自然排序 由小到大");
        a1.stream().sorted().forEach(System.out::println);
        System.out.println("-----------------------------------");
        //2、反转 有大到小
        System.out.println("2、反转 有大到小");
        a1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }

    @Test
    /**
     * 1、sorted() Comparable比较器 排序
     * 2、函数式接口 写法
     *   System.out::println
     *   PrintStream out =System.out;
     *   out.println();
     */
    public void test4() {
        ArrayList<Student> a2 = new ArrayList<Student>();
        a2.add(new Student(1, "B", 15));
        a2.add(new Student(2, "A", 38));
        a2.add(new Student(3, "C", 16));
        //1、自然排序 由小到大
        System.out.println("1、自然排序 name由小到大");
        a2.stream().sorted().forEach(System.out::println);
        System.out.println("-----------------------------------");
        System.out.println("2、自然排序 name反转");
        a2.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("-----------------------------------");
        System.out.println("3、根据类属性排序");
        a2.stream().sorted(Comparator.comparing(Student::getAge)).forEach(System.out::println);
        System.out.println("-----------------------------------");
        System.out.println("4|先升序，再降序");
        a2.stream().sorted(Comparator.comparing(Student::getAge)).forEach(System.out::println);
        System.out.println("-----------------------------------");
        PrintStream out = System.out;
        out.println("-----------------------------------");
    }


    /**
     * 1、limit() 截取前多少个数据
     */
    @Test
    public void test5() {
        String[] s1 = {"a", "b", "c", "d"};
        //数组的方式创建流
        Stream<String> s2 = Stream.of(s1);
        //截取前两个字符串
        s2.limit(2).forEach(System.out::println);

    }

    /**
     * 1、distinct 普通去重
     */
    @Test
    public void test6() {

        String[] s1 = {"a", "a", "c", "d"};
        //数组的方式创建流
        Stream<String> s2 = Stream.of(s1);
        //去重后输出的数组
        s2.distinct().forEach(System.out::println);
        //输出去重后的数量
        //System.out.println(s2.distinct().count());

    }

    /**
     * 2、自定义对象去重 ，定义的对象要实现hashcode和 equals
     */
    @Test
    public void test7() {
        List<Books> b1 = new ArrayList<Books>();
        b1.add(new Books("数学", 12.2));
        b1.add(new Books("语文", 23.4));
        b1.add(new Books("数学", 12.2));
        b1.add(new Books("英语", 45.2));

        //获取去重后的数量
        long l4 = b1.stream().distinct().count();
        //输出去重后的数量
        System.out.println(l4);
        //输出去重后的对象
        b1.stream().distinct().forEach(System.out::println);

    }

    /**
     * 8、skip  跳过元素
     */
    @Test
    public void test8() {
        String[] s8 = {"张三", "李四", "王五", "赵六"};
        //数组的方式创建流
        Stream<String> s2 = Stream.of(s8);
        //跳过前三个元素
        s2.skip(3).forEach(System.out::println);

        List<Books> b1 = new ArrayList<Books>();
        b1.add(new Books("数学", 12.2));
        b1.add(new Books("语文", 23.4));
        b1.add(new Books("数学", 12.2));
        b1.add(new Books("mvc", 22));

        //跳过前三个对象元素
        b1.stream().skip(3).forEach(System.out::println);

    }

    /**
     * 1、mapTnInt 将接受一个函数为参数，该函数会作用于每个元素上
     */
    @Test
    public void test9() {
        ;
        List<String> l9 = Arrays.asList("3", "4", "23", "6");

        //int类型的流接受
        IntStream intStream = l9.stream().mapToInt(num -> Integer.parseInt(num)).filter(num -> num % 3 == 0);

        //l9.stream().mapToInt(num -> Integer.parseInt(num)).filter(num -> num % 3 == 0).forEach(System.out::println);
        intStream.forEach(System.out::println);//也可以不用返回接受，直接forEach


    }

    /**
     * 1、conut() 收集器
     */
    @Test
    public void test10() {

        IntStream intStream = IntStream.range(1,20);
        Stream<Integer> stream=intStream.boxed();//转换包装类型
        List<Integer> l10= stream.collect(Collectors.toList());
        System.out.println(l10);


    }


}
