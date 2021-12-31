package Test14.Proxy;

/**
 * Test14.Proxy
 *
 * @author yuhl
 * @date 2021/12/17
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);//加载文件名
    }

    @Override
    public void display() {
        System.out.println("显示 " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("等待加载 " + fileName);
    }
}
