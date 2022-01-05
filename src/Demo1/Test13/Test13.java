package Demo1.Test13;

/**
 * Demo1.Test13
 *
 * @author yuhl
 * @date 2021/12/17
 * 1、包装类
 * 。基本数据类型、基本数据包装类以及字符串之间的相互转换：
 * 1.通过引用数据类型字符串String类的valueOf0方法可以将8种基本数据类型转换为对应的字符串类型
 * 2.通过8种包装类的静态方法valueOfO既可以将对应的基本数据类型转换为包装类，也可以将变量内容匹配的字符串转换为对应的包装类（Character包装类除外）。
 * 3.通过8种包装类的有参均造方法同样既可以将对应的基本数据类型转换为包装类，也可以将变量内容，匹配的字符串转换为对应的包装类（Character包装类除外）。
 * 4.通过8种包装类的静态方法parsexxx（）可以将变量内容匹配的字符串转换为对应的基本数据类型。
 * 5.包装类都重写了Object类中的tostring（）方法，以字符串的形式返回被包装的基本数据类型的值。
 */
public class Test13 {
    public static void main(String[] args) {
        byte a=11;
        int  b=22;
        long c=33;
        short d=44;
        boolean e=true;
        char f='牛';
        //1.通过引用数据类型字符串String类的valueOf0方法可以将8种基本数据类型转换为对应的字符串类型
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        String s3 = String.valueOf(c);
        String s4 = String.valueOf(d);
        String s5 = String.valueOf(e);
        String s6 = String.valueOf(f);
        int i = new Integer(1).intValue(); //包装转int

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
             Float asas = 2.2f;
        //2.通过8种包装类的静态方法valueOfO既可以将对应的基本数据类型转换为包装类
        Integer integer =  Integer.valueOf(1);
        Boolean bo =Boolean.valueOf("true");
        System.out.println("静态方法 基本转包装："+integer);
        System.out.println("静态方法 基本转包装："+bo);

        // 3.通过8种包装类的有参均造方法同样既可以将对应的基本数据类型转换为包装类
        Integer integer1=new Integer(1);
        Float ff = new Float(1.0);


        // 4.通过8种包装类的静态方法parsexxx（）可以将变量内容匹配的字符串转换为对应的基本数据类型。
        Integer integer2 =Integer.parseInt("222"); //字符串 转换为基本类型INT

        //5.包装类都重写了Object类中的tostring（）方法，以字符串的形式返回被包装的基本数据类型的值。
        System.out.println("默认加tostring"+s4.toString());
    }
}
