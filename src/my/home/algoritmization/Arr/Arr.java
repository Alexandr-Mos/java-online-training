package my.home.algoritmization.Arr;


import java.util.Arrays;

public class Arr {
    public static void fill(int[] mas){
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) Math.round(Math.random()*20-10);
        }
        System.out.println(Arrays.toString(mas));
    }
    public static void fill(double[] mas){
        for (int i = 0; i < mas.length; i++) {
            mas[i] = Math.random()*20-10;
            mas[i] = Math.round(mas[i]*100.0) / 100.0;
        }
        System.out.println(Arrays.toString(mas));
    }
}
