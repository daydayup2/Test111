package ThreadDemo.CallbackDemo;

/**
 * ThreadDemo.CallbackDemo
 *
 * @author yuhl
 * @date 2022/1/26
 */
public class Client {

    Server server;
    String msg;
    public Client(Server server) {
        this.server = server;
    }

    public  void send(String msg)  {
        System.out.println("正在发送消息");
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    server.getMsg(new CallbackDemo() , msg);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        System.out.println("发送消息，"+msg);
    }
}
