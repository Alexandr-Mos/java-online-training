package my.home.algoritmization.Arr;
/*
Даны действительные числа а1,а2..а2n
Найти max(a1+a2n,a2+a2n-1...)
*/

import java.util.Scanner;

public class arr7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] mas = new double[2*n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = Math.random()*100-50;
        }

        double max = Double.MIN_VALUE;
        for (int i = 0; i < mas.length/2; i++) {
            double sum = mas[i] + mas[2*n - (i+1)];
            if (sum > max){
                max = sum;
            }
        }

        System.out.println("Max = " + max);
    }
}

