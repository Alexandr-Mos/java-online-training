package my.home.module1_first_level.branching;

import java.util.Scanner;

/*Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, 
то будет ли он прямоугольным*/

public class Branching1 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите 2 угла >>");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        
        if (180 - x - y > 0) {
            if (180 - x - y == 90 || x == 90 || y == 90) {
                System.out.println("Прямоугольный");
            } else {
                System.out.println("Существует");
            }
        } else {
            System.out.println("Не существует");
        }
    }
    
}
