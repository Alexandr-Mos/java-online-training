package my.home.algoritmization.Arr;

public class arr6 {
    public static void main(String[] args) {
        //double[] mas = {-1.5465,-74879,0,465.2,55.2154,0,-0.24546};
        double[] mas = new double[10000];
        for (int i = 0; i < 10000; i++) {
            mas[i] = i+1; // чтобы элементы массива соответствовали порядковому номеру, а не индексу
        }
        double sum = 0;
        for (int i = 1; i < mas.length; i++) { // простые числа начинаются с 2
            if (isPrime(i+1)) { //порядковый номер начинается с 1, а массив с 0. Поэтому нужно прибавить 1
                sum += mas[i];
                System.out.println(mas[i]);
            }
        }
        System.out.println("Sum = " + sum);
    }

    private static boolean isPrime(int number){
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
