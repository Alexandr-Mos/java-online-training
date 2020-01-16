package my.home.firstLevel.linear;

import java.util.Scanner;

public class lin1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        System.out.println(((a-3)*b/2)+c);
    }
}
