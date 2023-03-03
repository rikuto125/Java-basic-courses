package contents2;

import java.util.Scanner;
public class Contents2_2 {
    public static void main(String[] args){

        //Javaの標準入力からの入力を受け取るために、Scannerクラスのインスタンスを作成するもの
        Scanner scanner = new Scanner(System.in);
        String num1 = null;
        String num2 = null;
        boolean isNumeric = false;

        System.out.println("１つ目の数値を入力してください");
        num1 = scanner.next();
        isNumeric = num1.matches("[+-]?\\d*(\\.\\d+)?");
        if(!isNumeric) {
            System.out.println("１つ目の入力値は数値ではありません");
            return;
        }

        System.out.println("２つ目の数値を入力してください");
        num2 = scanner.next();
        isNumeric =  num2.matches("[+-]?\\d*(\\.\\d+)?");
        if(!isNumeric) {
            System.out.println("２つ目の入力値は数値ではありません");
            return;
        }

        // castをしている
        int wa = Integer.parseInt(num1) + Integer.parseInt(num2);
        int sa = Integer.parseInt(num1) - Integer.parseInt(num2);
        int seki = Integer.parseInt(num1) * Integer.parseInt(num2);
        int syo = Integer.parseInt(num1) / Integer.parseInt(num2);
        int amari = Integer.parseInt(num1) % Integer.parseInt(num2);

        System.out.println("和：" + wa);
        System.out.println("差：" + sa);
        System.out.println("積：" + seki);
        System.out.println("商：" + syo);
        System.out.println("余り：" + amari);
    }
}