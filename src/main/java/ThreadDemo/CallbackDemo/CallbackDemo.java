package ThreadDemo.CallbackDemo;

/**
 * ThreadDemo
 *
 * @author yuhl
 * @date 2022/1/26
 *
 * 异步回调 异步回调 异步回调
 */
public class CallbackDemo implements Callback {
    @Override
    public void process(int stuts) {

                System.out.println("处理成功，"+stuts);


    }
}
