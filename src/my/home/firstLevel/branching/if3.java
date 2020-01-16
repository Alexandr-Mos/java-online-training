package my.home.firstLevel.branching;

import java.util.Scanner;

public class if3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        //Проверка на равенство площади треугольника нулю, который построен по точкам
        System.out.println(((x1-x3)*(y2-y3)-(x2-x3)*(y1-y3))// /2
                == 0);
    }
}
