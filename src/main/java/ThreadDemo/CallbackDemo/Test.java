package ThreadDemo.CallbackDemo;

/**
 * ThreadDemo.CallbackDemo
 *
 * @author yuhl
 * @date 2022/1/26
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {

        Server server =new Server();
        Client client=new Client(server);
        client.send("hello");
    }
}
