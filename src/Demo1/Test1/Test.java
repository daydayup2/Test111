package Demo1.Test1;

/**
 * Demo1.Test1
 *
 * @author yuhl
 * @date 2021/12/14
 *///向上转型
public class Test {
    public static  void main (String[] arg){
        Person p =new Student();//向上转型，父类引用可以指向子类对象，子类引用不能指向父类对象。
        Student s= (Student) p;//1、把指向子类对象的父类引用赋给子类引用叫向下转型，要强制转型
        //2、必须是父类对象所指的真实子类对象
        p.eat();

        s.eat();
        s.run();
    }
}
