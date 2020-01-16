package my.home.firstLevel.cycle;

import java.math.BigInteger;

public class for3 {

    public static void main(String[] args) {
        //v2
        int x = 100;
        BigInteger sum2 = BigInteger.valueOf(1);
        for (int i = 1; i <= x; i++) {
            sum2 = sum2.multiply(BigInteger.valueOf(i*i));
        }
        System.out.println(sum2);
    }
}
