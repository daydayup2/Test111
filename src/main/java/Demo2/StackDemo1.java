package Demo2;

import java.util.Stack;

/**
 * Demo2
 *
 * @author yuhl
 * @date 2022/1/5
 *
 * Stack栈操作
 * 1、peek() 获取栈顶元素
 * 2、pop() 移除最后一个元素
 */
public class StackDemo1 {


    public static void main(String[] args) {
//        Stack s1 = new Stack(); //实例化stack
//        s1.push(1);
//        s1.push(2);
//        s1.push(3);
//
//        s1.pop();//移除最后一个元素
//        System.out.println("是否为空" + s1.empty());
//        System.out.println("栈顶元素" + s1.peek());  //栈 后进先出，先进后出
//        System.out.println("打印s1" + s1);
        Stack<MyObject> s2 = new Stack<MyObject>(); //1、泛型 指定参数类型
        //2、后面可省略参数

        s2.push(new MyObject(1, "张三"));
        s2.push(new MyObject(2, "李四"));

        System.out.println("栈顶元素" + s2.peek());  //栈 后进先出，先进后出
        System.out.println("打印s2" + s2);
    }

}

class MyObject {
    int id;

    String name;

    MyObject(int id, String name) {
        this.name = name;
        this.id = id;
    }


    @Override
    public String toString() {
        return "MyObject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
