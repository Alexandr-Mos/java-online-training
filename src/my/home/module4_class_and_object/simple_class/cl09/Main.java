package my.home.module4_class_and_object.simple_class.cl09;

/*Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.

	Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
	Найти и вывести:
	a) список книг заданного автора;
	b) список книг, выпущенных заданным издательством;
	c) список книг, выпущенных после заданного года.*/

public class Main {

	public static void main(String[] args) {
		Library lib = new Library();
		lib.addBook(new Book(1, "Hobbit", "Tolkien", "Publisher 1", 1996, 200, 6.8, "Soft"));
		lib.addBook(new Book(2, "Lord of the rings", "Tolkien", "Publisher 2", 1998, 256, 10.0, "Soft"));
		lib.addBook(new Book(3, "The Tomb", "Lovecraft", "Publisher 3", 1917, 457, 15.0, "Soft"));
		lib.addBook(new Book(4, "Dagon", "Lovecraft", "Publisher 3", 1996, 200, 9.8, "Soft"));
		lib.addBook(new Book(5, "The Tree", "Lovecraft", "Publisher 3", 1996, 200, 3.4, "Soft"));
		lib.addBook(new Book(6, "Капитанская дочка", "Пушкин", "Издатель 5", 1836, 340, 6.8, "Soft"));
		lib.addBook(new Book(7, "Евгений Онегин", "Пушкин", "Publisher 1", 1888, 200, 6.2, "Soft"));
		lib.addBook(new Book(8, "Война и мир", "Толстой", "Издатель 5", 1865, 200, 100, "Soft"));
		
		System.out.println("Книги Lovecraft-а");
		for(Book b : lib.getBooksByAuthor("Lovecraft")) {
			System.out.println(b);
		}
		
		System.out.println("Книги от издательства Publisher 1");
		for(Book b : lib.getBooksByPublisher("Publisher 1")) {
			System.out.println(b);
		}
		
		System.out.println("Книги после 1850-го");
		for(Book b : lib.getBooksByYear(1850)) {
			System.out.println(b);
		}
		
		
	}

}
