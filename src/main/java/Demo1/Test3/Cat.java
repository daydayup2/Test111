package Demo1.Test3;

import java.security.PublicKey;

/**
 * Demo1.Test3
 *
 * @author yuhl
 * @date 2021/12/14
 */
public class Cat extends Animal {
    private  int sum;


    public Cat(int sum){

        this.sum=super.sum+sum;
    }
    @Override
    public int  run() {
          return this.sum;
    }
}
