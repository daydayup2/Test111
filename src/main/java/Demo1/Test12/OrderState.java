package Demo1.Test12;

/**
 * Demo1.Test12
 *
 * @author yuhl
 * @date 2021/12/17
 */
public enum OrderState {
    CANCEL{public String getName() {
        return "取消";
    }},
    TRUE{public String getName() { return "取消"; }};

    public abstract String getName();


}
