package my.home.firstLevel.linear;

public class lin4 {
    public static void main(String[] args) {
        double R = 123.456f;
        int x = (int) R;
        int y = (int) (R*1000) % 1000;
        double rez = y + x/1000.0;
        System.out.println(rez);
    }
}
