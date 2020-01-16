package my.home.algoritmization.Dec;

public class Dec6 {
    public static void main(String[] args) {
        if (NOD3(2,6,12) == 1) {
            System.out.println("Числа взаимно простые");
        } else {
            System.out.println("Числа не взаимно простые");
        }
    }

    public static int NOD3(int a, int b, int c){
        return NOD(a,NOD(b,c));
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
