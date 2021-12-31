package TestNum;

import java.util.Scanner;

/**
 * TestNum
 *
 * @author yuhl
 * @date 2021/12/15
 *///猜数字，及改造为抽象类
public class Test {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int a = (int) (Math.random() * 10 + 1);
        //System.out.println(a);
        System.out.println("请猜");
        int i=1;
        while (true) {
            int result = sc.nextInt();
            System.out.println("次数"+ i++);
//         if (a < result) {
//                System.out.println("大了");
//            }else if(a < result){
//                System.out.println("小了");
//            }else{
//                System.out.println("对了");
//                break;
            if (new MyGuess().Complete(a, result)) {
                break;
            }
        }
    }

}
