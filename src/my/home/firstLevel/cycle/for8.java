package my.home.firstLevel.cycle;

import java.util.Scanner;

public class for8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        String y = scanner.nextLine();
        char[] x1 = x.toCharArray();
        char[] y1 = y.toCharArray();
        int count;
        for (int i = 0; i < x.length(); i++) {
            count = 0;
            for (int j = 0; j < y.length(); j++) {
               if (x1[i] == y1[j]){
                   count++;
                   y1[j] = 32;
               }
            }
            if (count != 0) System.out.println(x1[i]);
        }
    }
}
