package my.home.firstLevel.linear;

import java.util.Scanner;

/*Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.*/
public class lin1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        scanner.close();
        
        System.out.println(((a-3) * b / 2) + c);
        
    }
}