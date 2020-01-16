package my.home.algoritmization.Sort;

import my.home.algoritmization.Arr.Arr;

import java.util.Arrays;

public class sort4 {
    public static void main(String[] args) {
        int[] mas = new int [30];
        Arr.fill(mas);
        boolean isSorted = false;
        int buf;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if (mas[i] > mas[i+1]){
                    isSorted = false;
                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
