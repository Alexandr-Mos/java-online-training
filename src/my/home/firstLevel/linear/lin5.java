package my.home.firstLevel.linear;

public class lin5 {
    public static void main(String[] args) {
        long T = 3961;
        System.out.println(T/3600 + "ч"+
                T%3600/60 + "м" +
                T%60 + "с");
    }
}
