package my.home.algoritmization.Arr;

public class arr5 {

    public static void main(String[] args) {
        int[] mas = {-2,2,78,65,12,0,-45,-23,-74,1,9,8,13};
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > i) System.out.println(mas[i]);
        }
    }
}
