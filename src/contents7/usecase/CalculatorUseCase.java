package contents7.usecase;


import contents7.domain.CalculatorException;
import contents7.domain.CalculatorResult;

public interface CalculatorUseCase {
    CalculatorResult calculate(double number1, char operator, double number2) throws CalculatorException;
}