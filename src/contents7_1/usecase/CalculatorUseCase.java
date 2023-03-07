package contents7_1.usecase;


import contents7_1.domain.CalculatorException;
import contents7_1.domain.CalculatorResult;

public interface CalculatorUseCase {
    CalculatorResult calculate(double number1, char operator, double number2) throws CalculatorException;
}