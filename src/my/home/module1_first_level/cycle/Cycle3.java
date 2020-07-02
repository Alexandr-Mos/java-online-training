package my.home.module1_first_level.cycle;

/*Найти сумму квадратов первых ста чисел.*/

public class Cycle3 {

    public static void main(String[] args) {
        int x = 100;
        int sum = 0;
        
        for (int i = 1; i <= x; i++) {
            sum += i * i;
        }
        System.out.println(sum);
    }
    
}
