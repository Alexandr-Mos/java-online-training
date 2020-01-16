package my.home.algoritmization.Dec;

public class Dec7 {
    public static void main(String[] args) {

        System.out.println(factFrom1To9());

    }

    public static int factFrom1To9(){
        int sum = 0;
        for (int i = 1; i <= 9; i += 2) {
            sum += fact(i);
        }
        return sum;
    }

    public static int fact(int n){
        if (n <= 0)return 0;
        return n + fact(n-1);
    }

}


