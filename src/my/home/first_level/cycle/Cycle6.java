package my.home.first_level.cycle;

/*Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.*/

public class Cycle6 {
	
    public static void main(String[] args) {
        for (char i = 0; i < 255; i++) {
            System.out.println(i + " " + (i+0));
        }
    }
    
}
