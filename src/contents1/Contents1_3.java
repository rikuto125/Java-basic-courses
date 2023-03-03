package contents1;
public class Contents1_3 {

    public static void main(String[] args){
        int i=0;

        byte b=0;
//      byte	数値	1バイト(8ビット)	-128〜127(約128)


        short s=0;
//      short int型のサイズは2バイトで、
//      最大値は32767、最小値は-32768となります。
//      printf関数などを使って出力表示する際の変換指定子はdになります。

        long l= 0;
//      long int型のサイズは8バイトで、
//      最大値は9223372036854775807、
//      最小値は-9223372036854775808となります。


        i = 10000;
        b = 64;
        s = 255;
        l = 1000000;

        System.out.println(i);	// int型の表示
        System.out.println(b);	// byte型の表示
        System.out.println(s);	// short型の表示
        System.out.println(l);	// long型の表示
    }
}

