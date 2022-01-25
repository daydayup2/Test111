package Demo1.Test14.Proxy;

/**
 * Demo1.Test14.Proxy
 *
 * @author yuhl
 * @date 2021/12/17
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename){
        this.filename=filename;
    }

    @Override
    public void display() {
        if(realImage ==null){
            realImage=new RealImage(filename);
        }
        realImage.display();

    }
}
