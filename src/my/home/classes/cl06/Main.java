package my.home.classes.cl06;

public class Main {

	public static void main(String[] args) {
		Time time = new Time();
		System.out.println(time);
		
		time.setTime(23, 35, 11);
		System.out.println(time);
		
		time.setHours(25);
		System.out.println(time);

	}

}
