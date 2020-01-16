package my.home.firstLevel.linear;

import java.util.Scanner;

public class lin6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        System.out.println((x >= -2 && x <= 2 && y >=0 && y <= 4) ||
                (x >= -4 && x <= 4 && y >=-3 && y <= 0));

    }
}
