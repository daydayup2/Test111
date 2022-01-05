package Demo1.TestNum;

/**
 * Demo1.TestNum
 *
 * @author yuhl
 * @date 2021/12/15
 */
public abstract class Guess {


    public boolean Complete(int a, int result) {

        if (a < result) {
            return less();
        } else if (a < result) {
            return big();
        } else {
            return nice();
        }
    }

    public abstract boolean less();//小于

    public abstract boolean big();//大于

    public abstract boolean nice();//等于
}
