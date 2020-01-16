package my.home.algoritmization.Sort;

import java.util.Arrays;

public class sort1 {
    public static void main(String[] args) {
        int[] mas1 = {1,23,1,2,3,12,44,1};
        int len1 = mas1.length;
        int[] mas2 = {0,0,1,2,3,4,5,6,7,8,9,9};
        int k = 1;
        mas1 = Arrays.copyOf(mas1,mas1.length+mas2.length); //Расширяем первый массив
        System.arraycopy(mas1,k, mas1, mas1.length-(len1-k),len1-k); // копируем вторую часть массива в конец
        System.arraycopy(mas2,0,mas1,k,mas2.length); // вставляем второй массив
        System.out.println(Arrays.toString(mas1));
    }
}
