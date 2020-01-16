package my.home.algoritmization.Dec;

import java.util.Arrays;

public class Dec10 {
    public static void main(String[] args) {
        int n = -12345;
        int[] mas = intToArray(n);
        System.out.println(Arrays.toString(mas));
    }

    public static int[] intToArray(int n){
        n = Math.abs(n);
        char[] chars = String.valueOf(n).toCharArray();
        int[] mas = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            mas[i] = Character.getNumericValue(chars[i]);
        }
        return mas;
    }
}
