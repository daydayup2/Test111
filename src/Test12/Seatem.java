package Test12;

/**
 * Test12
 *
 * @author yuhl
 * @date 2021/12/16
 */
public enum Seatem {
    SPRING("春天"),SUMMER("夏天"),FALL("秋天"),WINTER("冬天");

    private final String name;

    private Seatem(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;

    }
    public  final  void show(){
        System.out.print(this.name);
    }



}
