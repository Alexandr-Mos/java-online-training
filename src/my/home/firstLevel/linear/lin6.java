package my.home.firstLevel.linear;

import java.util.Scanner;

/*Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае: */
public class lin6 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        scanner.close();
        
        System.out.println((x >= -2 && x <= 2 && y >= 0  && y <= 4) ||
                		   (x >= -4 && x <= 4 && y >= -3 && y <= 0));
    }
    
}
