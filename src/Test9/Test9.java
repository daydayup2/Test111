package Test9;

import sun.applet.Main;

/**
 * Test9
 *
 * @author yuhl
 * @date 2021/12/16
 * 1、静态内部类只能访问 外部类 static 静态的方法和属性
 * 2、用内部类的对象，调用内部类方法去调用外部类的静态方法和属性
        */
public class Test9 {
    public static void main(String[] args) {
        Outer.Inter io= new Outer.Inter();  //创建静态内部类对象
        io.show1();
        io.show2();

    }
}
