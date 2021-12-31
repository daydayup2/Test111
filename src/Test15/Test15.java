package Test15;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Test15
 *
 * @author yuhl
 * @date 2021/12/17
 * 冒泡排序
 */
public class Test15 {
    public static void main(String[] args) {
        int[] a1 = new int[3];
        int[] a2 = new int[]{1, 2, 3, 4};
        int[][] a3 = new int[2][3];
        int[] a4 = {1, 2, 3, 4};

        a3[0][0] = 1;
        a3[0][1] = 1;
        a3[0][2] = 1;
        a3[1][0] = 3;
        a3[1][1] = 4;
        a3[1][2] = 4;

        for (int i = 0; i < a3.length; i++) {
            for (int j = 0; j < a3[i].length; j++) {
                System.out.println(a3[i][j]);
            }
        }

        System.out.println(a3.length);
        System.out.println(a3[1].length);

        int temp=0;
        for (int i = 0; i < a4.length; i++) {
            for (int j = 0; j < a4.length - 1 - i; j++) {
                if (a4[j] < a4[j + 1]) {
                    temp = a4[j + 1];
                    a4[j + 1] = a4[j];
                    a4[j] = temp;
                }
                for (int count:a4) {
                    System.out.print(a4);
                }

            }

        }
    }
}
