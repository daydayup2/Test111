package ThreadDemo;

import java.util.concurrent.Callable;

/**
 * ThreadDemo
 *
 * @author yuhl
 * @date 2022/1/25
 * 方法三 1、实现Callable接口,重写call方法，此方法有返回值
 */
public class ThreadDemo3 implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName()+"我是call");
        return "学习";
    }
}
