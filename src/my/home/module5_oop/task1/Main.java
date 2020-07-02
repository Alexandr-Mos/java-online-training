package my.home.module5_oop.task1;

/*Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить.*/

public class Main {
	
	public static void main(String[] args) {
		Directory dir = new Directory("c\\:новая папка");
		TextFile tf1 = new TextFile(dir, "новый файл");
		tf1.addContent("Бла-бла\r\nблаблабла");
		tf1.open();
		tf1.rename("новый файл 2");
		tf1.delete();
		tf1.open();

	}
	
}
