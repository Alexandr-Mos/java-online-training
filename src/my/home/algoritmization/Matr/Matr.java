package my.home.algoritmization.Matr;

public class Matr {
    static void fill(int[][] matr, int x, int y){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matr[i][j] = (int) Math.round(Math.random()*18-9);
                    System.out.print(matr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void fillPos(int[][] matr, int x, int y){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matr[i][j] = (int) Math.round(Math.random()*9);
                    System.out.print(matr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void fillTo15(int[][] matr, int x, int y){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matr[i][j] = (int) Math.round(Math.random()*15);
                System.out.print(matr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void print(int[][] matr, int x, int y){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                    System.out.print(matr[i][j] + "\t");
            }
            System.out.println();
        }
    }static void print(double[][] matr, int x, int y){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                    System.out.printf("%8.2f",matr[i][j]);
            }
            System.out.println();
        }
    }
}
