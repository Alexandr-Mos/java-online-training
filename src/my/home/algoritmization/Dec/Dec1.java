package my.home.algoritmization.Dec;

public class Dec1 {
    public static void main(String[] args) {
        System.out.println(NOK(10,24));
    }

    public static int NOK(int a, int b){
        return a*b/NOD(a,b);
    }

    //алгоритм Евклида
    public static int NOD(int a, int b){
        while(a!=0 && b!=0){
            if (a>b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a + b;
    }
}
