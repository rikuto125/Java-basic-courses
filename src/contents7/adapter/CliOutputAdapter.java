package contents7.adapter;

import contents7.domain.CalculatorResult;

public class CliOutputAdapter {
    public void printResult(CalculatorResult result) {
        System.out.println("計算結果: " + result.getResult());
    }

    public void printError(String message) {
        System.err.println("Error: " + message);
    }
}
