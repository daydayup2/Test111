package Stream;

import org.junit.Test;

import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream
 *
 * @author yuhl
 * @date 2022/1/21
 * 1、并行流和串行流运行时间对比
 *    l1.Stream()
 *    l1.parallelStream()
 */
public class StreamDemo2 {
    @Test
    public void test2() {

        Random random = new Random();

        //iterate()返回一个无限顺序有序流
        //limit() 取前10000
        //UUID.randomUUID()无限流
        //collect(Collectors.toList())收集成数组
        List<UUID> l1 = Stream.iterate(UUID.randomUUID(), t -> UUID.randomUUID()).limit(100000).collect(Collectors.toList());


        //随机数参数无限流
//        Stream.iterate(random.nextInt(100), t -> random.nextInt(100)).limit(100).forEach(a -> {
//            System.out.println(a);
//        });

        //指定数
//        Stream.iterate(1,n->n-1).limit(100).forEach(a->{
//            System.out.println(a);
//        });
        System.out.println("开始串行数据流..");
        long sortStartTime= System.nanoTime();
        l1.stream().sorted().count();
        long sortEndTime= System.nanoTime();

        System.out.println("开始并行数据流..");

        long sortStartTime1= System.nanoTime();
        l1.parallelStream().sorted().count();
        long sortEndTime1= System.nanoTime();

        //传参一，传参二，返回值
        BiFunction<Long,Long,Long> as= (start, end)->TimeUnit.NANOSECONDS.toMillis(end -start);
        //System.out.println(sortEndTime-sortStartTime);
        long  l2=  as.apply(sortStartTime,sortEndTime);
        long  l3=  as.apply(sortStartTime1,sortEndTime1);
        System.out.println(l2);
        System.out.println(l3);

    }
}
