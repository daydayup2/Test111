package Demo2;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Demo2
 *
 * @author yuhl
 * @date 2022/1/11
 *
 * 1、TreeSet 用自己写的比较器排序
 *   mycom实现Comparator接口
 */
public class TreeSetDemo2 {
    public static void main(String[] args) {

        TreeSet<Student> s1 = new TreeSet(new mycom()); //student 没有实现compartor ，此时需要传递自己写的比较器
        s1.add(new Student("张三2",15));
        s1.add(new Student("张三1",15));
        s1.add(new Student("李四1",15));
        s1.add(new Student("李四2",14));
        s1.add(new Student("王五1",18));

        for (Student t: s1) {
            System.out.println(t); //输出结果去除了重复元素
        }

    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
this.name=name;
this.age =age ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class mycom implements Comparator {//mycom实现Comparator接口

    @Override
    public int compare(Object o1, Object o2) {
        Student t1 = (Student) o1; //强制转换类型  或者使用泛型
        Student t2 = (Student) o2;
        if (t1.getAge() == t2.getAge()) {//年龄相等 String 已经
            return t1.getName().compareTo(t2.getName());
        }

        return t1.getAge() - t2.getAge();
    }
}