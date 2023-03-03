package contents7.domain;

public class CalculatorInput {
    private double number1;
    private char operator;
    private double number2;

    public CalculatorInput(double number1, char operator, double number2) {
        this.number1 = number1;
        this.operator = operator;
        this.number2 = number2;
    }

    public double getNumber1() {
        return number1;
    }

    public char getOperator() {
        return operator;
    }

    public double getNumber2() {
        return number2;
    }
}
