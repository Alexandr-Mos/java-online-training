package my.home.firstLevel.cycle;

import java.util.Scanner;

/*Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
все числа от 1 до введенного пользователем числа.*/
public class for1 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int sum = 0;
        while (x <= 0) {
        	x = scanner.nextInt();
        } 
        scanner.close();
        
        for (int i = 1; i <= x; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
    
}
