package my.home.oop.task5;

public class Candy {
	private String name;
	private int count;
	
	public Candy(String name, int count) {
		this.name = name;
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Candy [name=" + name + ", count=" + count + "]";
	}

}
