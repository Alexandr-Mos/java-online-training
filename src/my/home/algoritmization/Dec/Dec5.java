package my.home.algoritmization.Dec;

import algoritmization.Arr.Arr;

import java.util.Arrays;

public class Dec5 {
    public static void main(String[] args) {
        int n = 0;
        int[] mas = new int[n];
        Arr.fill(mas);
        find2max(mas);

    }

    public static void find2max(int[] mas){
        if (mas.length == 0) return;
        Arrays.sort(mas);
        if (mas.length >= 2) {
            System.out.println(mas[mas.length-2]);
        } else {
            System.out.println(mas[0]);
        }
    }

}
