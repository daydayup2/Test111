package Demo1.Test6;

import Demo1.Test3.Animal;

/**
 * Demo1.Test6
 *
 * @author yuhl
 * @date 2021/12/15
 */
public class Pig extends Animal {
    @Override
    public int run() {
        return 0;
    }

    public static void main(String[] args) {
        Pig pig =new Pig();
        pig.a=1;  //子类访问 父类的 prctcted

    }
}
