package behavioural.strategy;

public class SubtractStrategy implements Strategy {

    @Override
    public Integer doOperation(int a, int b) {
        return a - b;
    }
}
