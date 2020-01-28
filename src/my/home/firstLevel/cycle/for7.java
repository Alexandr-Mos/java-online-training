package my.home.firstLevel.cycle;

import java.util.Scanner;

/*Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры.*/
public class for7 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();
        
        for (int i = m; i <= n; i++) {
            System.out.println("Число = " + i);
            System.out.print("Делители: ");
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                	System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
    
}
