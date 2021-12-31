package Test2;

/**
 * Test2
 *
 * @author yuhl
 * @date 2021/12/14
 * static 修饰的父类方法 继承后还是父类
 */
public class Test2 {
    public static void main(String [] arg){
        Animal animal=new Cat();
        animal.eat(); //static 修饰 继承后还是 父类方法

    }
}
