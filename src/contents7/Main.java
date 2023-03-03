package contents7;


import contents7.adapter.CliInputAdapter;
import contents7.adapter.CliOutputAdapter;
import contents7.domain.Calculator;
import contents7.domain.CalculatorException;
import contents7.domain.CalculatorInput;
import contents7.domain.CalculatorResult;
import contents7.usecase.CalculatorUseCase;
import contents7.usecase.CalculatorUseCaseImpl;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        CalculatorUseCase calculatorUseCase = new CalculatorUseCaseImpl(calculator);
        CliInputAdapter inputAdapter = new CliInputAdapter();
        CliOutputAdapter outputAdapter = new CliOutputAdapter();

        while (true) {
            try {
                CalculatorInput input = inputAdapter.getCalculatorInput();
                CalculatorResult result = calculatorUseCase.calculate(input.getNumber1(), input.getOperator(), input.getNumber2());
                outputAdapter.printResult(result);
            } catch (CalculatorException e) {
                outputAdapter.printError(e.getMessage());
            }

            boolean command = inputAdapter.readString("終了する場合はEOFを入力してください: ");
            if (command) {
                return;
            }
        }
    }
}
