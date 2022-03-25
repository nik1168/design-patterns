package behavioural.strategy;

public class MultiplyStrategy implements Strategy {

    @Override
    public Integer doOperation(int a, int b) {
        return a * b;
    }
}
