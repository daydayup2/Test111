package Demo1.TestNum;

/**
 * Demo1.TestNum
 *
 * @author yuhl
 * @date 2021/12/15
 */
public class MyGuess extends Guess {
    @Override
    public boolean less() {
        System.out.println("大大");
        return false;
    }

    @Override
    public boolean big() {
        System.out.println("小小");
        return false;
    }

    @Override
    public boolean nice() {
        System.out.println("等等");
        return true;
    }
}
