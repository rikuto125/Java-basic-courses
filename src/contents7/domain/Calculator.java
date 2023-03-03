package contents7.domain;

public class Calculator {
    public CalculatorResult calculate(double number1, char operator, double number2) throws CalculatorException {
        double result = 0;
        try {
            switch (operator) {
                case '+':
                    result = number1 + number2;
                    break;
                case '-':
                    result = number1 - number2;
                    break;
                case '*':
                    result = number1 * number2;
                    break;
                case '/':
                    if (number2 == 0) {
                        throw new CalculatorException("Division by zero");
                    }
                    result = number1 / number2;
                    break;
                default:
                    throw new CalculatorException("Invalid operator: " + operator);
            }
        } catch (CalculatorException e) {
            throw e;
        }
        return new CalculatorResult(result);
    }
}

//Calculatorクラスは、ドメインロジックである四則演算を実行するためのクラスです。
//四則演算自体は、ビジネスロジックであり、ドメイン層の責務に該当します。
//そのため、Calculatorクラスはドメイン層に属し、ビジネスロジックを実行する責務を持つクラスとして実装されました。
//これは、ドメイン層にビジネスロジックを集約するDDDの原則に沿った実装と言えます。