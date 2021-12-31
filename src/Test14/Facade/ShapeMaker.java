package Test14.Facade;

/**
 * Test14.Facade
 *
 * @author yuhl
 * @date 2021/12/17
 */
public class ShapeMaker {

    private  Circle circle;
    private  Rectangle rectangle;

    public ShapeMaker(){
        circle= new Circle();
        rectangle =new Rectangle();
    }
    public  void dawncircle(){
        circle.drow();
    }
    public  void dawnrectangle(){
        rectangle.drow();
    }
}
