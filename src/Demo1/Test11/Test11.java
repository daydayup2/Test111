package Demo1.Test11;

/**
 * Demo1.Test11
 *
 * @author yuhl
 * @date 2021/12/16
 * 1.如果Lambda表达式的方法体代码只有一行代码，可以省略大括号不写，同时要省略分号！
 * 2.如果Lambda表达式的方法体代码只有一行代码，可以省略大括号不写。
 * 此时，如果这行代码是return语句，必须省略return不写，同时也必须省略““不写
 * 3.参数类型可以省略不写。
 * 4.如果只有一个参数，参数类型可以省略，同时（也可以省略。
 * <p>
 * 除了以上简化规则，我们还可以使用“方法引用”进一步简化Lambda表达式
 * ·说明：Lambda表达式的主体只有一条语句时，程序不仅可以省略包含主体的花括号，还可以通过英文双冒号::的语法格式来引用方法和构造器（即构造方法）。
 * <p>
 * ·作用：可以进一步简化Lambda表达式的书写，其本质都是对Lambda表达式的主体部分已存在的方法进行直接引用，主要区别就是对普通方法与构造方法的引用而已。
 */
////使用Lambda表达式方式
// printAbs(-10，n->Math.abs(n));
////使用方法引用的方式
//printAbs(-10，Math::abs）;

interface Cable {
    int abs(int num);
}

class Math {
    public static   int math(int num) {
        if (num < 0) {
            return num = -num;
        } else {
            return num ;
        }
    }

}

public class Test11 {
    private  static  void printabs(int n,Cable cable){
        System.out.println(cable.abs(n));
    }

    public static void main(String[] args) {
        printabs(-99, new Cable() {
                @Override
                public int abs(int num) {
                    return Math.math(num);
                }
        });
        //1、
        printabs(-8, (Cable) num ->{return Math.math(num);});
        //2、省略{} return
        printabs(-8, (Cable) num -> Math.math(num));
        //3、
        printabs (-8,Math::math);

    }
}
