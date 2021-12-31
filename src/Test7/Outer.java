package Test7;

import sun.management.counter.StringCounter;

import java.sql.SQLOutput;

/**
 * Test7
 *
 * @author yuhl
 * @date 2021/12/15
 * //普通内部类的互相调用
 * 定义：在一个类中除了可以定义成员变量、成员方法，还可以定义类，这样的类被称作成员内部类。
 * 说明：在成员内部类中，可以访问外部类的所有成员，包括成员变量和成员方法；在外部类中同样可以访问成员内部类的变量和方法
 * 创建内部类对象的具体语法格式如下：
 * 外部类名.内部类名变量名=new外部类名（）.new内部类名（）；
 */
public class Outer {
    int a =1;

    private void Out() {
        System.out.println("外部类");
       Inner inner = new Inner();//外部类不能直接调用，可以用对象调用
//        inner.iner();
        System.out.println("外部类用对象访问内部类属性" + inner.B);

//        class Inner{//局部内部类  方法里的类
//            int c=4;
//            public  void inner(){
//                System.out.println("局部内部类"+a);//局部内部类可以直接访问外部类属性
//                Out();//局部内部类可以直接访问外部类方法
//            }
//    }
    }

    class Inner{//普通内部类  类里的类
        //static C=4;//非静态的内部类 不能用static声明
        int B=3;
        public void iner(){
            System.out.println("内部类"+a);//内部类可以直接访问外部类属性
            Out(); //内部类可以直接访问 外部类的方法
        }
    }


}
