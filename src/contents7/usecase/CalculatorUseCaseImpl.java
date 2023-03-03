package contents7.usecase;

import contents7.domain.Calculator;
import contents7.domain.CalculatorException;
import contents7.domain.CalculatorResult;

public class CalculatorUseCaseImpl implements CalculatorUseCase {
    private Calculator calculator;

    public CalculatorUseCaseImpl(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public CalculatorResult calculate(double number1, char operator, double number2) throws CalculatorException {
        return calculator.calculate(number1, operator, number2);
    }
}
