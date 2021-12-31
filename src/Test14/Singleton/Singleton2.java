package Test14.Singleton;

/**
 * Test14
 *
 * @author yuhl
 * @date 2021/12/17
 */
public class Singleton2 {
    private  static  Singleton2 singleton2 =new Singleton2();
    private  Singleton2(){

    }
    public static Singleton2 getsingleton2(){
        return  singleton2;
    }
}
