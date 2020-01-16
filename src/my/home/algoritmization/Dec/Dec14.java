package my.home.algoritmization.Dec;


//Сделал по условию. Т.е. возводил сумму цифр в степень. По определению числа Армстронга нужно складывать цифры возведеные в степень
public class Dec14 {
    public static void main(String[] args) {
        int k = 13001;
        showAllArmstrNumb(k);
    }

    public static void showAllArmstrNumb(int k){
        for (int i = 1; i <= k; i++) {
            if (Math.pow(getSumOfDigits(i),getLengthOfNumber(i)) == i){
                System.out.println(i);
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

    public static int getSumOfDigits(int n){
        int sum = 0;
        int digit = 0;
        while (n > 0) {
            digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        return sum;
    }
}
