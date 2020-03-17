package my.home.classes.composition.comp01;

/* Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста. */

public class Main {

	public static void main(String[] args) {
		Text text = new Text("Агрегация" , 
				"Агрегация (агрегирование по ссылке) — отношение «часть-целое» между "
				+ "двумя равноправными объектами, когда один объект (контейнер) "
				+ "имеет ссылку на другой объект. "
				+ "Оба объекта могут существовать независимо: если контейнер будет уничтожен, "
				+ "то его содержимое — нет.");
		
		text.addText("\r\nВзято из википедии. Еще предложение.");
		
		System.out.print("Header: ");
		text.printHeader();
		System.out.print("Text: ");
		text.printText();
		
		System.out.print("Random word: " + text.getSentenceList().get(0).getWordList().get(2));
		

	}

}
