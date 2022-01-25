package Demo1.Test1;

/**
 * Demo1.Test1
 *
 * @author yuhl
 * @date 2021/12/13
 */
public class Student extends  Person {

    public Student(){
        //eat();
        //super.eat();
      super();

    }

    public void eat(){
        //eat();
        //super.eat();
        System.out.println("学生吃");
    }
    public void run(){
        //eat();
        //super.eat();
        System.out.println("学生跑");
    }

    public  void look(Person p){
        p.eat();

    }


}
