package Test5;

/**
 * Test5
 *
 * @author yuhl
 * @date 2021/12/15
 *///实现接口 案例
public class Test5 {
    public static void main(String[] arg) {

        Printer printer = new Printer();
        Box box = null;
        Paper paper = null;


        paper = new A4Paper();
        box = new BlackBox();

        printer.setPaper(paper);
        printer.setBox(box);

        printer.print();
    }
}
