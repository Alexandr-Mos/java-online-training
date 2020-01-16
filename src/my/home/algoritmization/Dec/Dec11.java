package my.home.algoritmization.Dec;

public class Dec11 {
    public static void main(String[] args) {
        int a = 1243420;
        int b = -2354530;
        System.out.println(witchMore(a,b));
    }

    public static int witchMore(int a, int b){
        if (getLengthOfNumber(a) > getLengthOfNumber(b)){
            return a;
        } else {
            if (getLengthOfNumber(a) == getLengthOfNumber(b)){
                return 0;
            } else {
                return b;
            }
        }
    }

    public static int getLengthOfNumber(int num){
        num = Math.abs(num);
        int counter = 1;
        while (num > 9){
            counter++;
            num = num / 10;
        }
        return counter;
    }
}
