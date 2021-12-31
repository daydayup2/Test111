package Test10;

/**
 * Test10
 *
 * @author yuhl
 * @date 2021/12/16
 */
public class Test10 {
    public static void main(String[] args) {
        Outer outer = new Outer();
//        MyInterface myInerface=new Implasdas();
//        outer.test(myInerface);                 //传统做法

        outer.test(new MyInterface() { //创建匿名内部类的形式 不用写实现类，直接传递接口
            @Override
            public void show() {
                System.out.println("show实现接口");
            }
        });
        //lambda 表达式
        outer.test((MyInterface) () -> {System.out.println("show实现接口");});
        //简化lambda 表达式             ruturn也可以省略
        outer.test((MyInterface) () -> System.out.println("show实现接口"));
    }
}
