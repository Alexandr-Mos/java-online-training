package my.home.class_and_object.simple_class.cl07;

public class Triangle {
	private Point a;
	private Point b;
	private Point c;
	private double ab;
	private double bc;
	private double ca;

	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.ab = getDistance(a, b);
		this.bc = getDistance(b, c);
		this.ca = getDistance(c, a);
	}


	public double getSpace() {
		double p = (ab + bc + ca) / 2.0;
		return Math.sqrt(p * (p - ab) * (p - bc) * (p - ca));
	}

	public double getPerimeter() {
		return ab + bc + ca;
	}

	private double getDistance(Point a, Point b) {
		double pow1 = Math.pow(Math.abs(a.getX()) - Math.abs(b.getX()), 2);
		double pow2 = Math.pow(Math.abs(a.getY()) - Math.abs(b.getY()), 2);
		
		return Math.sqrt(pow1 + pow2);
	}

	public Point medianInterseptionPoint() {
		Point d = new Point((a.getX() + b.getX()) / 2.0, (a.getY() + b.getY()) / 2.0);
		
		double tempX = (c.getX() + 2 * d.getX()) / 3.0;
		double tempY = (c.getY() + 2 * d.getY()) / 3.0;
		return new Point(tempX, tempY);
	}

}
