package my.home.module5_oop.task5;

public class Wrap {
	private String color;
	private String design;
	
	public Wrap() {}
	
	public Wrap(String color, String design) {
		this.color = color;
		this.design = design;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDesign() {
		return design;
	}

	public void setDesign(String design) {
		this.design = design;
	}

	@Override
	public String toString() {
		return "Wrap [color=" + color + ", design=" + design + "]";
	}
}
