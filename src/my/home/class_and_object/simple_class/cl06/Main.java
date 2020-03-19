package my.home.class_and_object.simple_class.cl06;

/*Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
заданное количество часов, минут и секунд.*/

public class Main {

	public static void main(String[] args) {
		Time time = new Time();
		System.out.println(time);

		time.setTime(23, 35, 11);
		System.out.println(time);

		time.setHours(25);
		System.out.println(time);

		time.setMinutes(25);
		System.out.println(time);

		time.setSeconds(25);
		System.out.println(time);

	}

}
