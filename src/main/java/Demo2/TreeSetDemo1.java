package Demo2;

import sun.reflect.generics.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Demo2
 *
 * @author yuhl
 * @date 2022/1/6
 * 1、treeset 可以对元素进行排序
 * 自然排序， 比较器
 * 2、去除重复元素
 * 3、使用自然排序
 */
public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<Teacher> s2 = new TreeSet<Teacher>();  //好像必须实现Comparable接口，不然报错
        //TreeSet<String> s3 = new TreeSet();
        s2.add(new Teacher("张三1",15));
        s2.add(new Teacher("李四1",15));
        s2.add(new Teacher("张三2",15));
        s2.add(new Teacher("王五1",18));
        s2.add(new Teacher("李四2",14));
        s2.add(new Teacher("王五1",23));
        s2.add(new Teacher("王五1",23));

        for (Teacher s1:s2) {
            System.out.println(s1); //输出结果去除了重复元素
        }

    }
}

class Teacher implements Comparable {  //实现自然排序

    String name;
    int age;
    Teacher (String name,int age){
     this.name=name;
     this.age=age;
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
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Teacher)){
            throw new RuntimeException("类型不对");
        }
        Teacher t1 = (Teacher) o;
        //小于返回负数  等于 返回0  大于返回正数
        if (this.age > t1.getAge()) {
            return 1;
        }
        if (this.age < t1.getAge()) {
            return -1;
        }
        if (this.age == t1.getAge()) {
            return this.name.compareTo(t1.name);
        }

        return -1;

    }
}