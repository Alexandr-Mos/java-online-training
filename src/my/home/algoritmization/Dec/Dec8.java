package my.home.algoritmization.Dec;

import algoritmization.Arr.Arr;

public class Dec8 {
    public static void main(String[] args) {
        int k = 3;
        int m = 6;
        int[] mas = new int[10];
        Arr.fill(mas);

        System.out.println(sum(k,m,mas));

    }

    public static int sum(int k, int m, int[] mas) {
        int sum = 0;
        for (int i = k-1; i < m-1; i++) {
            sum += mas[i];
        }
        return sum;
    }
}
