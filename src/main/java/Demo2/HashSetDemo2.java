package Demo2;

import java.util.HashSet;
import java.util.Objects;

/**
 * Demo2
 * @author yuhl
 * @date 2022/1/6
 *  hashSet
 * 1.重写hashcode 和equals 去除重复
 */
public class HashSetDemo2 {
    public static void main(String[] args) {
        HashSet<User> s1= new HashSet<User>();
        s1.add(new User("张三",19));
        s1.add(new User("李四",14));
        s1.add(new User("张三",22));
        s1.add(new User("张三",19));
        for(User u1:s1){ //声明name 每次去接收
            System.out.println(u1);
        }

    }
}

class User {


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;  //如果相等 user == o 返回true
        if (o instanceof User) {  //判断是否是User对象，只有相同对象才能比较
            User u1 = (User) o;   //强制转换类型，
            return this.age ==u1.age && this.name.equals(u1.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.age+this.name.hashCode();
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return age == user.age &&
//                Objects.equals(name, user.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }

    String name;
    int age;

    User(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}