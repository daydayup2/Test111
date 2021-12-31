package Test7;

import com.sun.org.apache.bcel.internal.generic.NEW;

import javax.activation.MailcapCommandMap;

/**
 * Test7
 *
 * @author yuhl
 * @date 2021/12/15
 * //普通内部类 的互相访问
 */
public class Test7 {
    public static void main(String[] args) {
     Outer.Inner io = new Outer().new Inner(); //创建成员内部类对象
     io.iner();

    }


}
