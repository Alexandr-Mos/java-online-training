package my.home.module4_class_and_object.simple_class.cl03;

/* Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.*/

public class Main {

	public static void main(String[] args) {
		Student[] students = new Student[10];
		int[] rating;

		//Генерация студентов
		for (int i = 0; i < students.length; i++) {
			rating = new int[5];
			for (int j = 0; j < rating.length; j++) {
				rating[j] = (int) Math.round(Math.random() * 2 + 8);
			}
			
			students[i] = new Student("Student" + i, 123 * i, rating);
		}
		
		System.out.println("Все студенты:");
		for (Student s : students) {
			System.out.println(s);
		}

		System.out.println("Отличники:");
		for (Student s : students) {
			if (s.isExcellentPupil()) {
				System.out.println(s.getName() + " " + s.getGroup());
			}
		}
	}

}
