package my.home.oop.task1;

public class TextFile extends File {
	private static String endpoint = ".txt"; 
	private String content = "";
	
	public TextFile(Directory dir, String name) {
		super(dir, name);
	}
	
	public void open() {
		System.out.println(content);
	}

	public void addContent(String content) {
		this.content += content;
	}
	
}