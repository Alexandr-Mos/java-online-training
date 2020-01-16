package my.home.algoritmization.Arr;

public class arr4 {
    public static void main(String[] args) {
        double[] mas = {-1.5465,-74879,0,465.2,55.2154,0,-0.24546};
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        int max_index = 0;
        int min_index = 0;
        double buff = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
                max_index = i;
            }
            if (mas[i] < min) {
                min = mas[i];
                min_index = i;
            }
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        buff = mas[max_index];
        mas[max_index] = mas[min_index];
        mas[min_index] = buff;
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
