package Test14.ShapeFactory;

/**
 * Test14.ShapeFactory
 *
 * @author yuhl
 * @date 2021/12/17
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
