package Test4;

/**
 * PACKAGE_NAME
 *
 * @author yuhl
 * @date 2021/12/14
 * //interface 接口 弥补JAVA无法多继承缺陷
 */
public class Test4 {
    public static void main(String [] arg){
        MediaBook bm= new MediaBook();
        bm.look();
        bm.See();
        System.out.println(bm.look()+"  "+bm.See());
    }
}
