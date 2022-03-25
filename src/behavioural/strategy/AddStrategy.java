package behavioural.strategy;

public class AddStrategy implements Strategy {
    @Override
    public Integer doOperation(int a, int b) {
        return a + b;
    }
}
