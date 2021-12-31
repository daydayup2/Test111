package Test3;

/**
 * Test3
 *
 * @author yuhl
 * @date 2021/12/14
 */
public class Test3 {
    public static  void  main (String [] arg){
        Animal A=new Cat(9);//向上转型
        A.run();
        System.out.println("猫的sum:"+A.run());
    }
}
