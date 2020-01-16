package my.home.firstLevel.linear;

import java.util.Scanner;

public class lin2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        System.out.println(((b+Math.sqrt(b*b+4*a*c))/2/a)-a*a*a*c+1/b/b);
    }
}
