package my.home.algoritmization.Dec;

public class Dec15 {
    public static void main(String[] args) {
        int n = 3;
        int begin = (int) Math.pow(10,n - 1);
        int end = (int) (Math.pow(10,n) - 1);
        for (int i = begin; i <= end ; i++) {
            if (isInc(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isInc(int n){
        while (n > 0){
            if (getLastDigit(n) < getLastDigit(removeLastDigit(n))) {
                return false;
            }
            n = removeLastDigit(n);
        }
        return true;
    }

    public static int getLastDigit(int n){
        return n%10;
    }

    public static int removeLastDigit(int n) {
        return n/10;
    }
}
