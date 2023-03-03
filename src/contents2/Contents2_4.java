package contents2;

import java.util.Scanner;
public class Contents2_4 {

    public static void main(String[] args) {
        String num1 = null;
        String num2 = null;

        String message = null;

        message = "１つ目";

        num1 = inputCheck(message);
        if(num1 == null) {
            return;
        }

        message = "２つ目";

        num2 = inputCheck(message);
        if(num2 == null) {
            return;
        }

        int wa = sum(num1, num2);
        int sa = diff(num1, num2);
        int seki = product(num1, num2);
        int syo = quotient(num1, num2);
        int amari = remainder(num1, num2);

        System.out.println("和：" + wa);
        System.out.println("差：" + sa);
        System.out.println("積：" + seki);
        System.out.println("商：" + syo);
        System.out.println("余り：" + amari);
    }


    private static int remainder(String num1, String num2) {
        return Integer.parseInt(num1) % Integer.parseInt(num2);
    }

    private static int quotient(String num1, String num2) {
        return Integer.parseInt(num1) / Integer.parseInt(num2);
    }

    private static int product(String num1, String num2) {
        return Integer.parseInt(num1) * Integer.parseInt(num2);
    }

    private static int diff(String num1, String num2) {
        return Integer.parseInt(num1) - Integer.parseInt(num2);
    }

    private static int sum(String num1, String num2) {
        return Integer.parseInt(num1) + Integer.parseInt(num2);
    }

    private static String inputCheck(String message) {
        Scanner scanner = new Scanner(System.in);
        String num = null;
        boolean isNumeric = false;

        System.out.println(message + "の数値を入力してください");
        for(int i = 1; i <= 3; i++){
            num = scanner.next();
            isNumeric = num.matches("[+-]?\\d*(\\.\\d+)?");
            if (isNumeric){
                return num;
            }else if (i==3){
                System.out.println("３回入力して失敗した為、終了します。");
                return null;
            }else {
                System.out.println(message + "の入力値は数値ではありません。再度入力してください。");
            }
        }

        return null;
    }
}