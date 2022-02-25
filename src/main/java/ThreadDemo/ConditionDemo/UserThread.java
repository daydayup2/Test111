package ThreadDemo.ConditionDemo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * ThreadDemo.ConditionDemo
 *
 * @author yuhl
 * @date 2022/2/25
 */
public class UserThread extends  Thread{

    private  int sum=0;
    private Lock lock;
    private Condition condition;

    public UserThread(Lock lock,Condition condition) {
        this.lock = lock;
        this.condition = condition;
    }

    public int getsum(){
       return sum;
    }
    public void run(){
        lock.lock();
        for(int i=0;i<100;i++){
            sum+=i;
        }
        condition.signal();//相当于 notify
        lock.unlock();
    }
}
