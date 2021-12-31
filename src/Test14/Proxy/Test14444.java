package Test14.Proxy;

/**
 * Test14.Proxy
 *
 * @author yuhl
 * @date 2021/12/17
 *
 * 1、代理模式
 */
public class Test14444 {
    public static void main(String[] args) {
        Image image = new ProxyImage("asas");
        image.display();
        image.display();
    }
}
