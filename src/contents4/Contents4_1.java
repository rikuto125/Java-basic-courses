package contents4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Contents4_1 {
    /**
     * @param args
     */
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        Map<Integer, Integer> straightUp = new HashMap<>();
        Map<String, Integer> highAndLow = new HashMap<>();
        Map<String, Integer> oddEven = new HashMap<>();
        ArrayList<Map> betMap = new ArrayList<>();

        straightUp = StraightUp();
        highAndLow = HighAndLow();
        oddEven = OddEven();

        betMap.add(straightUp);
        betMap.add(highAndLow);
        betMap.add(oddEven);
    }

    @SuppressWarnings("resource")
    private static Map<String, Integer> OddEven() {
        Map<String, Integer> oddEven = new HashMap<>();

        while(true) {
            Scanner scanner = null;
            System.out.println("Odd-Even(奇数・偶数賭け)にベッドしますか。Y：はい、N：いいえ");
            scanner = new Scanner(System.in);
            String strBet = null;
            strBet = scanner.nextLine();
            if ("Y".equals(strBet)) {
                Integer coin = null;
                System.out.println("奇数に賭けるコインの枚数を入力してください");
                coin  = scanner.nextInt();
                oddEven.put("Odd", coin);

                System.out.println("偶数に賭けるコインの枚数を入力してください");
                coin  = scanner.nextInt();
                oddEven.put("Even", coin);
                break;
            } else if ("N".equals(strBet)) {
                break;
            } else {
                System.out.println("入力エラー\n");
            }
        }

        return oddEven;
    }

    @SuppressWarnings("resource")
    private static Map<String, Integer> HighAndLow() {
        Map<String, Integer> highAndLow = new HashMap<>();

        while(true) {
            Scanner scanner = null;
            System.out.println("High-Low(18以上・18未満(0以外)賭け)にベッドしますか。Y：はい、N：いいえ");
            scanner = new Scanner(System.in);
            String strBet = null;
            strBet = scanner.nextLine();
            if (("Y".equals(strBet))) {
                Integer coin = null;
                System.out.println("Highに賭けるコインの枚数を入力してください");
                coin  = scanner.nextInt();
                highAndLow.put("High", coin);

                System.out.println("Lowに賭けるコインの枚数を入力してください");
                coin  = scanner.nextInt();
                highAndLow.put("Low", coin);
                break;
            } else if ("N".equals(strBet)) {
                break;
            } else {
                System.out.println("入力エラー\n");
            }
        }

        return highAndLow;
    }

    @SuppressWarnings("resource")
    private static Map<Integer, Integer> StraightUp() {
        Map<Integer, Integer> straightUp = new HashMap<>();
        Scanner scanner = null;
        boolean isNumeric = false;

        while(true) {
            System.out.println("ベッドする数値を入力してください。数値は0～36です。賭けない場合、Nを入力");
            scanner = new Scanner(System.in);
            String numBet = null;
            numBet = scanner.nextLine();

            if("N".equals(numBet)) {
                break;
            } else {
                isNumeric =  numBet.matches("[+-]?\\d*(\\.\\d+)?");
                if(isNumeric) {
                    Integer coin = null;

                    System.out.println("賭けるコインの枚数を入力してください");
                    coin  = scanner.nextInt();

                    straightUp.put(Integer.valueOf(numBet), coin);
                } else {
                    continue;
                }
            }

        }
        return straightUp;
    }
}
