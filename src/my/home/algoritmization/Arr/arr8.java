package my.home.algoritmization.Arr;

import java.util.Scanner;

public class arr8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mas = new int[n];
        Arr.fill(mas);
        int min = Integer.MAX_VALUE;
        int count = 1;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == min){
                count++;
            }
            if (mas[i] < min) {
                min = mas[i];
                count = 1;
            }
        }


        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == min) {
                for (int j = i; j < mas.length-1; j++) {
                    mas[j] = mas[j+1];
                }
            }
        }

        System.out.println("count " + count);
        for (int i = 0; i < mas.length-count; i++) {
            System.out.print(mas[i] + " "); // при необходимости создаем новый массив с размером mas.length-count и перезаписываем
        }



    }
}
