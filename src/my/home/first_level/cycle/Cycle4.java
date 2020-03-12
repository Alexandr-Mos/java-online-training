package my.home.first_level.cycle;

import java.math.BigInteger;

/*Составить программу нахождения произведения квадратов первых двухсот чисел.*/

public class Cycle4 {
	
    public static void main(String[] args) {
        int x = 200;
        BigInteger sum = BigInteger.valueOf(1);
        
        for (int i = 1; i <= x; i++) {
            sum = sum.multiply(BigInteger.valueOf(i*i));
        }
        System.out.println(sum);
    }
    
}
