package contents3;
import java.util.Random;

public class Contents3_1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] list = new int[5];

        for(int i=0; i < 5; i++) {
            // ランダムで値を入力する
            Random rand = new Random();
            list[i] = rand.nextInt(11);
        }

        for(int i=0; i < 5; i++) {
            // ランダムで入力した値を確認する
            System.out.println(list[i]);
        }
    }
}
