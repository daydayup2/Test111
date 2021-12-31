package Test15;

/**
 * Test15
 *
 * @author yuhl
 * @date 2021/12/20
 * 最大值
 */
public class Araay {
    public static void main(String[] args) {
        int[] a1 = {1, 3, 5, 8, 9};
        int max = a1[0];
        for (int i = 0; i < a1.length; i++) {
            if (max < a1[i]) {
                max = a1[i];
            }

        }
        System.out.println(max); //输出最大值

    }
}
