package behavioural.strategy;

public class DivideStrategy implements Strategy {

    @Override
    public Integer doOperation(int a, int b) {
        return a / b;
    }
}
