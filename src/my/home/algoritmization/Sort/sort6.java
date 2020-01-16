package my.home.algoritmization.Sort;

import my.home.algoritmization.Arr.Arr;

import java.util.Arrays;

public class sort6 {
    public static void main(String[] args) {
        double[] n = new double[20];
        Arr.fill(n);
        for (int i = 0; i < n.length-1; ) {
            if (n[i] <= n[i+1]) {
                i++;
            } else {
                double buf = n[i];
                n[i] = n[i+1];
                n[i+1] = buf;
                if (i > 0) {
                    i--;
                }
            }
        }
        System.out.println("Результат");
        System.out.println(Arrays.toString(n));
    }
}
