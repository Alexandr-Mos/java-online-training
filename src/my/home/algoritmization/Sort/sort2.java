package my.home.algoritmization.Sort;

import java.util.Arrays;

public class sort2 {
    public static void main(String[] args) {
        int[] mas1 = {1,23,1,2,3,12,44,1};
        int len1 = mas1.length;
        int[] mas2 = {0,0,1,2,3,4,5,6,7,8,9,9};

        mas1 = Arrays.copyOf(mas1,mas1.length+mas2.length); //Расширяем первый массив
        нельзяSystem.arraycopy(mas2,0,mas1,len1,mas2.length); // вставляем второй массив в первый
        Arrays.sort(mas1); // сортируем
        System.out.println(Arrays.toString(mas1));
    }
}
