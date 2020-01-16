package my.home.algoritmization.Arr;

import java.util.Scanner;

public class arr9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mas = new int[n];
        int[] mas2 = new int[n];
        Arr.fill(mas);
        int counter;
        int counterMax = Integer.MIN_VALUE;
        for (int i = 0; i < mas.length; i++) {
            counter = 1;
            for (int j = i+1; j < mas.length; j++) {
                if (mas[i] == mas[j]){
                    counter++;
                }
            }
            mas2[i] = counter;
            if (counter > counterMax){
                counterMax = counter;
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < mas2.length; i++) {
            if (mas2[i] == counterMax && mas[i] < min) {
                min = mas[i];
            }
        }
        System.out.println(min);

    }
}
