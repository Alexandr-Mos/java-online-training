package my.home.class_and_object.composition.comp01;

public class Word {
	private String value = "";
	
	public Word(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}

	@Override
	public String toString() {
		return this.value;
	}
	
}
