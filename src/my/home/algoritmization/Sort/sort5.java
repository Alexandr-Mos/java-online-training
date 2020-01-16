package my.home.algoritmization.Sort;

import java.util.Arrays;

public class sort5 {
    public static void main(String[] args) {
                 //  0 1 2 3 4 5 6  7  8 9 10
        int[] mas = {1,3,3,3,5,9,10,11,9,4,11};
        int i = 8; //индекс конца подпоследовательности
        for (int j = i; j < mas.length; j++) {
            //ищем место вставки
            int index = binSearch(mas, 0, i, mas[j]);
            //передвигаем элементы
            int buf = mas[j];
            for (int k = j; k > index; k--) {
                mas[k] = mas[k-1];
            }
            //вставляем на освободившееся место
            mas[index] = buf;
            //сдвигаем границу подпоследовательности, т.к. она увеличилась
            i++;
        }
        System.out.println(Arrays.toString(mas));
    }


    private static int binSearch(int[] mas, int sortedBegin, int soredEnd, int number){
        int middle = (sortedBegin + soredEnd) / 2;
        if ((soredEnd-sortedBegin)/2 == 0) {
            if (mas[middle] > number){
                return middle;
            } else {
                return middle+1;
            }
        }
        if (mas[middle] > number){
             return binSearch(mas, sortedBegin, middle, number);
        } else {
             return binSearch(mas, middle, soredEnd, number);
        }
    }
}
