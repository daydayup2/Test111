package Test14.Strategy;

/**
 * Test14.Strategy
 *
 * @author yuhl
 * @date 2021/12/17
 * 1、实现接口乘法
 */
public class OperationSubtract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1-num2;
    }
}
