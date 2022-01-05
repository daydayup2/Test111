package Demo1.Test10;

/**
 * Demo1.Test10
 *
 * @author yuhl
 * @date 2021/12/16
 *
 * 1、匿名内部类
 * ·定义：匿名内部类其实就是没有名称的内部类。
 * 。说明：在调用包含有接口类型参数的方法时，通常为了简化代码，可以直接通过置名内部类的形式传入一个接口类型参数，在匿名内部类中直接完成方法的实现
 */
public class Outer {
    public void test(MyInterface myInterface){
        System.out.println("test方法");
        myInterface.show();
    }
}
