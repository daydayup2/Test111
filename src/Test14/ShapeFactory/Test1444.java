package Test14.ShapeFactory;

/**
 * Test14.ShapeFactory
 *
 * @author yuhl
 * @date 2021/12/17
 */
public class Test1444 {
    public static void main(String[] args) {
        //创建工厂对象
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //调用 Circle 的 draw 方法
        shape1.draw();

    }
}
