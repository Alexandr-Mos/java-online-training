package my.home.algoritmization.Arr;

import java.util.Scanner;

public class arr2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double z = scanner.nextDouble();
        double[] mas = {1.2,2.4,3.6,4.0,5.2,6.4,7.6,8.8,10.0};
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > z) {
                mas[i] = z;
                count++;
            }
            System.out.print(mas[i] + " ");
        }

        System.out.println("\n" + count);
    }
}
