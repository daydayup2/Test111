package Stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Stream
 * @author yuhl
 * @date 2022/1/21
 *
 * 1、Stream流中的常用方法fliter，用于对stream流中的数据进行过滤，
 * filter方法的参数Predicate是一个函数式接口所以可以传递Lambda表达式，对数据进行过滤。
 * 2、合并流Stream.concat(流1，流2)
 */
public class StreamDemo3 {
    @Test
    public void test3() {
        List<String> l1 = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        //创建一个有限String 流

        Stream<String> l2 = Stream.of("小张", "", "小李", "小王", "虎虎", "", "牛牛");
        // 获取空字符串的数量
        long count = l1.stream().filter(string -> string.isEmpty()).count();


//        startsWith(String str)
//        startsWith(String str,int Index)
//        字符串中是否包含这个指定的字符串
//        重载的方法是可以指定是否在指定的下标开始的位置
        l2.filter(name -> name.startsWith("小")).forEach(a -> { System.out.println(a);});
        /**
         * 1、两种写法
         * 函数式接口
         * System.out::println
         * PrintStream out =System.out;
         * out.println();
         * 2、最终操作中我们获取了新的对象，也标志Stream操作的完结，
         *    最终操作只能进行一次。由于最终操作会产生新的数据，最终操作方法也称为及早求值方法。
         */
        //l2.filter(name -> name.startsWith("小")).forEach(System.out::println);
    }
}
