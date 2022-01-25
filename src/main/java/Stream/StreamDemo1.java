package Stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Stream
 *
 * @author yuhl
 * @date 2022/1/20
 * 1.无状态：指元素的处理不受之前元素的影响。
 * 2.有状态：指该操作只有拿到所有元素之后才能继续下去。
 * 3.非短路操作：指必须处理所有元素才能得到最终结果。
 * 4.短路操作：指遇到某些符合条件的元素就可以得到最终结果，如AIB，只要A为true，则无需判断B的结果。
 */
public class StreamDemo1 {


    @Test
    public void test1() {
        /**
         1、用此方法得到的List的长度是不可改变的，
         当你向这个List添加或删除一个元素时（例如 list.add("d");）程序就会抛出异常
         2、总结：如果你的List只是用来遍历，就用Arrays.asList()。
         如果你的List还要添加或删除元素，还是乖乖地new一个java.util.ArrayList，然后一个一个的添加元素。
         */
        List<String> strings = Arrays.asList("1", "", "2", "efg", "abcd", "", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println(filtered);
    }



}
