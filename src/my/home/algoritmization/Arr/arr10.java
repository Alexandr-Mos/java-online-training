package my.home.algoritmization.Arr;

import java.util.Scanner;

public class arr10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mas = new int[n];
        Arr.fill(mas);

        //зануление нечетных элементов массива
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 != 0) {
                mas[i] = 0;
            }
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        //Сдвиг нулей
        for (int i = 1; i < mas.length; i++) {
            for (int j = i; j < mas.length-1; j++) {
                mas[j] = mas[j+1];
            }
        }

        //вывод на экран
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
