package Demo1.Test12;

/**
 * Demo1.Test12
 *
 * @author yuhl
 * @date 2021/12/16
 *
 * 1、枚举类
 */
public class Testenum {
    public static void main(String[] args) {
        Seatem seatem = Seatem.FALL;

        //System.out.println(seatem.getName());
       // System.out.println(seatem.name());

        Seatem [] Se= Seatem.values();
        for (int i=0;i<Se.length;i++){
            Se[i].show();
            System.out.println(Se[i].ordinal());
           // System.out.println(Se[i].getName());

        }
    }

}
