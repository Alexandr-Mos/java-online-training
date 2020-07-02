package my.home.module4_class_and_object.composition.comp02;

public class Wheel {
	private String name;
	
	public Wheel(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}

}
