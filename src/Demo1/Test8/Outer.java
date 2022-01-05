package Demo1.Test8;

/**
 * Demo1.Test7
 *
 * @author yuhl
 * @date 2021/12/15
 * //局部内部类的互相调用
 * 1、局部内部类访问外类列当前方法中的局部变量时，因无法保障变量的生命周期（
 *    局部变量用过一次可能会被删除内存）与局部内部类相同，所以变量必须为常量（加修饰符：final）
 *    注意：从JDK.8开始；允许在局部内部类、匿名内部类中访问非final修饰的局部变量，而在JDK8之前，否则程序编译报错。局部变量前必须加final修饰符，
 * 2、Outer.this.a 调用外部类的属性，可以加，也可以直接用,
 * 3、this.c 调用内部类的属性，可以加this，也可以直接用
 */
public class Outer {
    int a =1; //外部类属性

    public  void test1(){

        System.out.println("外部类的成员方法 waibai 和属性"+a);
//        Inter inter=new Inter(); ////外部类的成员方法,无法访问 局部内部类
//        inter.show();

    }

    public void test2() {
        int b = 2;

        class Inter {//局部内部类 方法里的类
            int c = 4;
            public void show() {
                System.out.println("局部内部类" + Outer.this.a+this.c+b); //等同直接a
                System.out.println("局部内部类" + a +c+ b);//局部内部类可以直接访问外部类属性
                // test2();                                  //局部内部类可以直接访问外部类方法
                //test1();
            }
        }
        Inter inter=new Inter(); //只能在局部内部类的方法Out里访问,实例化在最后
        inter.show();
    }


}
