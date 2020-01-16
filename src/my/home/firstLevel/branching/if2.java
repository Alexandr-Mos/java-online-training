package my.home.firstLevel.branching;

import java.util.Scanner;

public class if2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(Math.max(Math.min(a,b),Math.min(c,d)));
    }
}
