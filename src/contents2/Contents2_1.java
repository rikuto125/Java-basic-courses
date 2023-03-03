package contents2;

import java.util.Scanner;
public class Contents2_1 {
   public static void main(String[] args){

       //Javaの標準入力からの入力を受け取るために、Scannerクラスのインスタンスを作成するもの
       Scanner scanner = new Scanner(System.in);

       int num1 = 0;
       int num2 = 0;

       System.out.println("１つ目の数値を入力してください");
       num1 = scanner.nextInt();

       System.out.println("２つ目の数値を入力してください");
       num2 = scanner.nextInt();

       int wa = num1 + num2;
       int sa = num1 - num2;
       int seki = num1 * num2;
       int syo = num1 / num2;
       int amari = num1 % num2;

       System.out.println("和：" + wa);
       System.out.println("差：" + sa);
       System.out.println("積：" + seki);
       System.out.println("商：" + syo);
       System.out.println("余り：" + amari);
   }
}