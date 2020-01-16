package algoritmization.Dec;

public class Dec13{
    public static void main(String[] args) {
        int n = 40;
        showPairs(n);
    }

    public static void showPairs(int n){
        for (int i = n; i <= 2*n-2; i++) {
            if (isPrime(i) && isPrime(i+2)) {
                System.out.println(i + " " + (i+2));
                i++; //пропускаем числа между близнецами
            }
        }
    }

    public static boolean isPrime(int n){
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
