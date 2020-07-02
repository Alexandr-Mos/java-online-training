package my.home.module5_oop.task5;

public class Candy {
	private String name;
	
	public Candy(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Candy [name=" + name + "]";
	}

}
