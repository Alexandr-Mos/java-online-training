package my.home.firstLevel.branching;

import java.util.Scanner;

public class if4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if (x <= A && y <= B) System.out.println("Пройдет");
        else if (x <= A && z <= B) System.out.println("Пройдет");
        else if (y <= A && z <= B) System.out.println("Пройдет");
        else if (x <= B && y <= A) System.out.println("Пройдет");
        else if (x <= B && z <= A) System.out.println("Пройдет");
        else if (y <= B && z <= A) System.out.println("Пройдет");
        else System.out.println("Не пройдет");
    }
}
