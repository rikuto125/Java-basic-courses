package contents7.adapter;

import contents7.domain.CalculatorInput;
import java.util.Scanner;

public class CliInputAdapter {
    private Scanner scanner;

    public CliInputAdapter() {
        scanner = new Scanner(System.in);
    }

    public CalculatorInput getCalculatorInput(Double num,Double kai) {
        double number1;
        if (kai == 1) {
            number1 = getNumber("1");
        }else{
            number1 = num;
            System.out.println("1の値を入力してください: 前回のnum:" + num +"を使用");
        }
        char operator = getOperator();
        double number2 = getNumber("2");
        return new CalculatorInput(number1, operator, number2);
    }

    public double getNumber(String numberName) {
        System.out.print(numberName + " の値を入力してください: ");
        String input = scanner.next();
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            System.err.println("数字を入力してください");
            return getNumber(numberName);
        }
    }

    public char getOperator() {
        System.out.println("演算子を入力してください(+, -, *, /): ");
        String input = scanner.next();
        if (input.length() != 1 || !"+-*/".contains(input)) {
            System.err.println("不正な演算子です");
            return getOperator();
        }
        return input.charAt(0);
    }

    public boolean readString(String message) {
        System.out.print(message);
        String input = scanner.next();
        return input.equalsIgnoreCase("EOF");
    }
}


//package contents7.adapter;
//
//import java.util.Objects;
//import java.util.Scanner;
//
//public class CliInputAdapter {
//    private final Scanner scanner;
//
//    public CliInputAdapter() {
//        scanner = new Scanner(System.in);
//    }
//
//    String StringNumber;
//
//    public double getNumber(String num) {
//        StringNumber = inputCheck(num);
//        return Double.parseDouble(StringNumber);
//    }
//
//    public char getOperator() {
//        Scanner scanner = new Scanner(System.in);
//        char operator;
//        do {
//            System.out.println("+, -, *, /のいずれかを入力してください");
//            operator = scanner.next().charAt(0);
//        } while (operator != '+' && operator != '-' && operator != '*' && operator != '/');
//        return operator;
//    }
//
//    public Boolean readString(String s) {
//        System.out.print(s);
//        if (Objects.equals(scanner.next(), "EOF")){
//            return true;
//        }
//        return false;
//    }
//
//    private static String inputCheck(String message) {
//        Scanner scanner = new Scanner(System.in);
//        String num = null;
//        boolean isNumeric = false;
//
//        System.out.println(message + "の数値を入力してください");
//        for(int i = 1; i <= 3; i++){
//            num = scanner.next();
//            isNumeric = num.matches("[+-]?\\d*(\\.\\d+)?");
//            if (isNumeric){
//                return num;
//            } else if (i==3){
//                System.out.println("３回入力して失敗した為、終了します。");
//                return null;
//            }else {
//                System.out.println(message + "の入力値は数値ではありません。再度入力してください。");
//            }
//        }
//
//        return null;
//    }
//}