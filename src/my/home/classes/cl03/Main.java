package my.home.classes.cl03;

public class Main {

	public static void main(String[] args) {
		Student[] students = new Student[10];
		int[] rating;
		
		for (int i = 0; i < students.length; i++) {
			rating = new int[5];
			for (int j = 0; j < rating.length; j++) {
				rating[j] = (int) Math.round(Math.random()*2 + 8);
			}
			Student s = new Student("Student" + i, 123*i, rating);
			students[i] = s;
		}
		
		for (Student s : students) {
			if (s.isExcellentPupil()) {
				System.out.println(s.getName() + " " +  s.getGroup());
			}
		}
	}

}
