package my.home.class_and_object.simple_class.cl07;

/*Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
площади, периметра и точки пересечения медиан.*/

public class Main {

	public static void main(String[] args) {
		Triangle triangle = Triangle.createTriangle(new Point(3, 3), 
				                                    new Point(5, 6), 
				                                    new Point(7, 7));
		
		System.out.println("Median interception point: " + triangle.medianInterseptionPoint());
		System.out.println("Space: " + triangle.getSpace());
		System.out.println("Perimeter: " + triangle.getPerimeter());
	}

}
