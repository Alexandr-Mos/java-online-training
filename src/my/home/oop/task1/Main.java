package my.home.oop.task1;

public class Main {
	
	public static void main(String[] args) {
		Directory dir = new Directory("c\\:", "новая папка");
		TextFile tf1 = new TextFile(dir, "новый файл");
		tf1.addContent("Бла-бла\r\nблаблабла");
		tf1.open();
		tf1.rename("новый файл 2");
		tf1.delete();
		tf1.open();

	}
	
}