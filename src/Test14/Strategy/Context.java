package Test14.Strategy;

/**
 * Test14.Strategy
 *
 * @author yuhl
 * @date 2021/12/17
 *
 * Context 是一个使用了某种策略的类，
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){  //构造方法，传strategy 创建对象
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
