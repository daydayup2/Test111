package Queue.DelayQueueDemo;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * Demo3
 *
 * @author yuhl
 * @date 2022/1/20
 * 1、DelayQueue是一个无界的BlockingQueue，用于放置实现了Delayed接口的对象，
 * 其中的对象只能在其到期时才能从队列中取走。这种队列是有序的，即队头对象的延退到期时间最长。
 * 2、不能将null元素放置到DelayQueue队列中。
 * 4、DelayQueue只能添加（offer/put/add）实现了Delayed接口的对象。
 */
public class DelayQueueDemo implements Delayed {
    //定义开始时间
    private long start = System.currentTimeMillis();//获取当前时间,产生一个当前的毫秒
    private String name;
    private long time;

    public DelayQueueDemo(String name, long time) {
        this.name = name;
        this.time = time;
    }

    /**
     * @param  unit 时间单位
     * @return 延迟时间 =过期时间-当前时间
     */
    @Override
    public long getDelay(TimeUnit unit) {
//        常用的颗粒度
//        TimeUnit.DAYS          //天
//        TimeUnit.HOURS         //小时
//        TimeUnit.MINUTES       //分钟
//        TimeUnit.SECONDS       //秒
//        TimeUnit.MILLISECONDS  //毫秒

        return unit.convert((start + time) - System.currentTimeMillis(),
                TimeUnit.MILLISECONDS);

    }

    @Override
    //延迟队列内部排序比较，当前对象时间-比较对象时间
    public int compareTo(Delayed o) {

        return (int) (this.getDelay(TimeUnit.MILLISECONDS) - o.getDelay(TimeUnit.MILLISECONDS));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
