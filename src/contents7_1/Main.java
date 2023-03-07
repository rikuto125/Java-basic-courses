package contents7_1;
import contents7_1.adapter.CliInputAdapter;
import contents7_1.adapter.CliOutputAdapter;
import contents7_1.domain.Calculator;
import contents7_1.domain.CalculatorException;
import contents7_1.domain.CalculatorInput;
import contents7_1.domain.CalculatorResult;
import contents7_1.usecase.CalculatorUseCase;
import contents7_1.usecase.CalculatorUseCaseImpl;

public class Main {
    public static void main(String[] args) {
        //adapterのinput
        CliInputAdapter inputAdapter = new CliInputAdapter();

        //ビジネスロジックとusecase
        Calculator calculator = new Calculator();
        CalculatorUseCase calculatorUseCase = new CalculatorUseCaseImpl(calculator);

        //adapterのoutput
        CliOutputAdapter outputAdapter = new CliOutputAdapter();

        double num = 0;
        double kai = 1;

        while (true) {
            try {
                CalculatorInput input = inputAdapter.getCalculatorInput(num,kai);
                CalculatorResult result = calculatorUseCase.calculate(input.getNumber1(), input.getOperator(), input.getNumber2());
                outputAdapter.printResult(result);
                num = result.getResult();
            } catch (CalculatorException e) {
                outputAdapter.printError(e.getMessage());
            }

            boolean command = inputAdapter.readString("終了する場合はEOF: 続行はcを入力してください");
            if (command) {
                return;
            }
            kai = kai +1;
        }
    }
}
