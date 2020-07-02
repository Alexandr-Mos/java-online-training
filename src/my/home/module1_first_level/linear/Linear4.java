package my.home.module1_first_level.linear;

/*4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
дробную и целую части числа и вывести полученное значение числа.*/
public class Linear4 {
	
    public static void main(String[] args) {
        double R = 123.456f;
        int x = (int) R;
        int y = (int) (R * 1000 % 1000);
        double rez = y + x / 1000.0;
        
        System.out.println(rez);
    }
    
}
