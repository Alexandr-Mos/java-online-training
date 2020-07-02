package my.home.module1_first_level.branching;

import java.util.Scanner;

/*Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой. */

public class Branching3 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        //Проверка на равенство площади треугольника нулю, который построен по точкам
        System.out.println(((x1-x3)*(y2-y3)-(x2-x3)*(y1-y3)) // / 2
        				     == 0);
    }
    
}
