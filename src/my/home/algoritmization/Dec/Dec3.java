package my.home.algoritmization.Dec;

public class Dec3 {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Площадь правильного шестиугольника: " + 6*areaOfTriangle(a,a,60));
    }

    public static double areaOfTriangle(double a, double b, double ang){
        return a*b*Math.sin(Math.toRadians(ang))/2.0;
    }
}
