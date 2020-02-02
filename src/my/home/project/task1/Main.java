package my.home.project.task1;

import java.io.IOException;

/*Задание 1: создать консольное приложение “Учет книг в домашней библиотеке”.
Общие требования к заданию:
• Система учитывает книги как в электронном, так и в бумажном варианте. +
• Существующие роли: пользователь, администратор. +
• Пользователь может просматривать книги в каталоге книг, осуществлять поиск
книг в каталоге.+
• Администратор может модифицировать каталог.+
• *При добавлении описания книги в каталог оповещение о ней рассылается на
e-mail всем пользователям
• **При просмотре каталога желательно реализовать постраничный просмотр+
• ***Пользователь может предложить добавить книгу в библиотеку, переслав её
администратору на e-mail.
• Каталог книг хранится в текстовом файле.+
• Данные аутентификации пользователей хранятся в текстовом файле. Пароль
не хранится в открытом виде+*/

public class Main {

	public static void main(String[] args) throws IOException {
		Console console = Console.getInstance();
		String command = "D:\\test";

		System.out.println("Введите директорию файлов библиотеки...");
		//command = console.nextCommand();
		HomeLibrary lib = new HomeLibrary(command);
		lib.initialise();
		
		
		
		while (!command.equals("exit")) {
			System.out.print("Введите команду ");
			command = console.nextCommand();
			
			switch (command.toLowerCase()) {
				case "login":
					lib.logout();
					lib.login();
					break;
				case "logout":
					lib.logout();
					break;
				case "registr":
					lib.addUser();
					break;
				case "catalog":
					lib.printCatalog();
					break;
				case "addbook":
					lib.addBook();
					break;
				case "removebook":
					lib.removeBook();
					break;
				case "search":
					lib.search();
					break;
				default:
					break;
			}
		}
		
		lib.close();
	}

}
