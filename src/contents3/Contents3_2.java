package contents3;

import java.util.Random;

public class Contents3_2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] list = new int[5];
        int temp;

        for(int i=0; i < 5; i++) {
            // ランダムで値を入力する
            Random rand = new Random();
            list[i] = rand.nextInt(11);
        }

        for(int i=0; i < 5; i++) {
            // ランダムで入力した値を確認する
            System.out.println(list[i]);
        }

        // 数値を降順に並び替える
        for(int i=0; i < list.length - 1; i++) {
            for(int j=list.length - 1; j > i; j--) {
                if(list[j - 1] > list[j]) {
                    temp = list[j -1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
            }
        }

        for(int i=0; i < 5; i++) {
            // 数値を降順を確認する
            System.out.println(list[i]);
        }
    }
}
