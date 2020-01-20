package my.home.classes;

public class Test1 {
	private int a;
	private int b;
	
	public static void main(String[] args) {
		
	}
	
	public int getSum() {
		return a + b;
	}
	
	public int getMax() {
		return a > b ? a : b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Test1 [a=" + a + ", b=" + b + "]";
	}
	
}

