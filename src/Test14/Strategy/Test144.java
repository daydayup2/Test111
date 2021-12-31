package Test14.Strategy;

/**
 * Test14.Strategy
 *
 * @author yuhl
 * @date 2021/12/17
 *
 * 1、策略模式
 *  一个接口，三个实现，根据传入的不同实现类对象，掉不同策略
 */
public class Test144 {
    public static void main(String[] args) {

        Context context1 =new Context(new OperationAdd());
        int a= context1.executeStrategy(2,6);

        Context context2 =new Context(new OperationSubtract());
        int b= context2.executeStrategy(2,6);

        Context context3 =new Context(new OperationMultiply());
        int c= context3.executeStrategy(2,6);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }


}
