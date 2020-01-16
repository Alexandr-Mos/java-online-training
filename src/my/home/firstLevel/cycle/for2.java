package my.home.firstLevel.cycle;

import java.util.Scanner;

public class for2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        for (int i = a; i <= b; i += h) {
            if (i > 2)System.out.print(i + " ");
            else System.out.print(-i + " ");
        }
    }
}
