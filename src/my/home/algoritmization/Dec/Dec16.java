package my.home.algoritmization.Dec;

public class Dec16 {
    public static void main(String[] args) {
        int n = 4;
        int begin = (int) Math.pow(10,n - 1);
        int end = (int) (Math.pow(10,n) - 1);
        int sum = 0;
        for (int i = begin; i <= end ; i++) {
            if (isFullOddNumber(i)) {
                sum += i;
            }
        }
        System.out.println("Sum : " + sum);
        System.out.println("Четные цифры : " + getEvensCount(sum));

    }

    public static int getEvensCount(int n) {
        int count = 0;
        while (n > 0) {
            if (!isOddDigit(getLastDigit(n))) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }

    public static boolean isFullOddNumber(int n) {
        while (n > 0) {
            if (!isOddDigit(getLastDigit(n))) {
                return false;
            }
            n = n / 10;
        }
        return true;
    }

    public static boolean isOddDigit(int n) {
        return n % 2 != 0;
    }

    public static int getLastDigit(int n) {
        return n % 10;
    }
}
