package my.home.firstLevel.branching;

import java.util.Scanner;

/*Вычислить значение функции*/
public class if5 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        scanner.close();
        double y;
        
        if (x>3) {
        	y = 1 / (Math.pow(x, 3) + 6);
        } else {
        	y = x * x - 3 * x + 9;
        } 
        System.out.println(y);
    }
    
}
