package my.home.module1_first_level.linear;

/* Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.*/
public class Linear5 {

    public static void main(String[] args) {
        long T = 3961;
        System.out.println(T/3600 + "ч"+
                T%3600/60 + "м" +
                T%60 + "с");
    }
    
}
