package ThreadDemo;

/**
 * ThreadDemo
 *
 * @author yuhl
 * @date 2022/1/26
 */
public class MyThread extends  Thread{
    private  int ticket=5;

    @Override
    public void run() {
        if (ticket > 0) {
            //synchronized (this) {
                if (ticket > 0) {
                    while (true) {
                        System.out.println("Thread:" + Thread.currentThread().getName() + "--Thread ticket = " + ticket--);
                        if (ticket < 0) {
                            break;
                        }
                    }
                }
            //}
        }
    }
}
