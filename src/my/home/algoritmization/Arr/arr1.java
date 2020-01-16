package my.home.algoritmization.Arr;

import java.util.Scanner;

public class arr1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] mas = new int[1000];
        for (int i = 1; i <= mas.length; i++) {
            mas[i-1] = i;
        }
        long summ = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % k == 0) summ += mas[i];
        }
        System.out.println(summ);
    }
}
