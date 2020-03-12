package my.home.first_level.linear;

import java.util.Scanner;

/* Вычислить значение выражения по формуле (все переменные принимают действительные значения):
(𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦)/(𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦)*∗ 𝑡𝑔 𝑥�
*/

public class Linear3 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
       
        System.out.println((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y));
    }
    
}
