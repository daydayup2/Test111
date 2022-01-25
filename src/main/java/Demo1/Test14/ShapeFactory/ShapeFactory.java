package Demo1.Test14.ShapeFactory;

/**
 * Demo1.Test14.ShapeFactory
 *
 * @author yuhl
 * @date 2021/12/17
 */
public class ShapeFactory {

    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType){

        if(shapeType == null){
            return null;
        }if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();

        }
        return null;
    }

}
