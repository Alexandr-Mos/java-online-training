package my.home.algoritmization.Dec;

public class Dec17 {
    public static void main(String[] args) {
        int n = 30;
        System.out.println("Количество шагов : " + getSteps(n));
    }

    public static int getSteps(int n) {
        int steps = 0;
        while (n > 0) {
            n = n - getSumOfDigits(n);
            steps++;
        }
        return steps;
    }

    public static int getSumOfDigits(int n){
        int sum = 0;
        while (n > 0) {
            sum += getLastDigit(n);
            n = removeLastDigit(n);
        }
        return sum;
    }

    public static int getLastDigit(int n){
        return n % 10;
    }

    public static int removeLastDigit(int n) {
        return n / 10;
    }
}
