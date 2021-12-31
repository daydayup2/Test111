package Test9;

/**
 * Test9
 *
 * @author yuhl
 * @date 2021/12/16
 * 静态内部类
 * 6、外部类如何调用静态内部类中的属性和方法
 * 　　　1）外部类可以通过创建静态内部类实例的方法来调用静态内部类的非静态属性和方法
 * 　　　2）外部类可以直接通过“ 外部类.内部类.属性（方法）” 的方式直接调用静态内部类中的静态属性和方法
 * 7、如何创建静态内部类实例
 * 　　　1）在非外部类中：外部类名.内部类名 name = new 外部类名.内部类名();
 * 　　　2）在外部类中：内部类名 name = new 内部类名();
 *1、静态内部类 只能访问外部静态的static的属性和方法，非static的方法和属性不能访问
 *
 */
public class Outer {
    int a = 1;

    public   void test1() { //外部非静态的方法
        System.out.println("外部类静态static成员方法");
    }
    public static void test2(){//外部静态的方法
        System.out.println("创建内部类对象，调用内部类方法去调用外部类静态方法，静态内部类可以访问外部类成静态员方法");
    }

     static class Inter {
        public  void show1(){
            System.out.println("静态内部类成员方法");
            //test1(); 只能访问外部静态的，非static 的方法和属性不能访问，只能访问static
        }
        public void show2(){
            test2();//访问外部静态
        }


    }
}
