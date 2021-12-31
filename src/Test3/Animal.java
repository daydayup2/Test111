package Test3;

/**
 * Test3
 *
 * @author yuhl
 * @date 2021/12/14
 */
public abstract  class  Animal {

   public int sum ;
   protected int a; //测试protected  不同包 子类可以访问
    int b; //Test6 测试默认访问权限

    public Animal(){

        this.sum=16;
    }
    public abstract  int run(); //不能用 private static final修饰
}
