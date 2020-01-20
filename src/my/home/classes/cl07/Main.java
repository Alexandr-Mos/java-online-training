package my.home.classes.cl07;

public class Main {

	public static void main(String[] args) {
		Triangle triangle = Triangle.createTriangle(new Point(3, 3), 
				                                    new Point(5, 6), 
				                                    new Point(7,7)) ;
		System.out.println(triangle.medianInterseptionPoint());
		System.out.println(triangle.getSpace());
		System.out.println(triangle.getPerimeter());
	}

}
