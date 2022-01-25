package Demo1.Test4;

/**
 * Demo1.Test4
 *
 * @author yuhl
 * @date 2021/12/14
 */
public interface  Media {
    public static  final  String mea="111";

    public default String look(){ //jdk 1.8 之后可以加默认方法
        return "听";
    }

    public static void info(){//jdk 1.8 之后可以加静态方法
    }

    public String write();
    public String hear();
}
