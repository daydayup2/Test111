package Demo1.Test15;

import java.util.Arrays;

/**
 * Demo1.Test15
 *
 * @author yuhl
 * @date 2021/12/21
 */
public class Array2 {
    public static void main(String[] args) {
        int[] a5 = {1, 23, 5, 56, 32};
        int array[];
        int[] array1;

        String[] strArray;
        //char[][] ch1 = new char[][];
        char[][] ch3 = new char[3][5];
        char[] ch2[] = new char[3][];

        System.out.println(Arrays.toString(ch3));
        System.out.println(Arrays.toString(ch2));


        System.out.println(Arrays.toString(a5));//按格式输出

        Arrays.sort(a5);//从小到大排序
        System.out.println(Arrays.toString(a5));


        a5 = Arrays.copyOf(a5, 8); //复制数组，或 扩容，
        a5[7] = 666;
        System.out.println(Arrays.toString(a5));//按格式输出

    }
}
