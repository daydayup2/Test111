package Demo1.Test5;

/**
 * Demo1.Test5
 *
 * @author yuhl
 * @date 2021/12/15
 */
public class Printer {



    Paper paper;
    Box box;

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    public void print() {
        System.out.println(paper.NewPaper()+ box.getBox());
    }
}
