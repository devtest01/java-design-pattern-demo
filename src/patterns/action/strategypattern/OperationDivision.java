package patterns.action.strategypattern;

public class OperationDivision implements Strategy {
    @Override
    public double doOperation(double num1, double num2) {
        return num2 == 0 ? 0 : num1 / num2;
    }
}
