package my.home.algoritmization.Sort;

import my.home.algoritmization.Arr.Arr;

import java.util.Arrays;


public class sort3 {
    public static void main(String[] args) {
        int[] mas = new int [30];
        Arr.fill(mas);
        for (int i = 0; i < mas.length; i++) {
            int max = Integer.MIN_VALUE;
            int maxIndex = 0;
            for (int j = i; j < mas.length; j++) {
                if (mas[j] > max){
                    max = mas[j];
                    maxIndex = j;
                }
            }
            int buf = mas[i];
            mas[i] = mas[maxIndex];
            mas[maxIndex] = buf;
        }
        System.out.println(Arrays.toString(mas));
    }
}
