package my.home.firstLevel.branching;

import java.util.Scanner;

/*Найти max{min(a, b), min(c, d)}.*/
public class if2 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        
        int minAB = a <  b ? a : b;
        int minCD = c <  d ? c : d; 
        
        System.out.println(minAB > minCD ? minAB : minCD);
    }
    
}
