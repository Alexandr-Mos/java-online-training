package my.home.module1_first_level.cycle;

import java.util.Scanner;

/*Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.*/

public class Cycle8 {
	
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        String y = scanner.nextLine();
        
        char[] x1 = x.toCharArray();
        char[] y1 = y.toCharArray();
        int count;
        
        for (int i = 0; i < x.length(); i++) {
            count = 0;
            for (int j = 0; j < y.length(); j++) {
               if ((x1[i] == y1[j]) && (x1[i] != 44)) {
                   count++;
                   y1[j] = 32;
               }
            }
            if (count != 0) {
            	System.out.println(x1[i]);
            } 
        }
    }
    
}
