package my.home.project.task1;

import java.io.IOException;
import java.util.Scanner;

/*Задание 1: создать консольное приложение “Учет книг в домашней библиотеке”.
Общие требования к заданию:
• Система учитывает книги как в электронном, так и в бумажном варианте.
• Существующие роли: пользователь, администратор.
• Пользователь может просматривать книги в каталоге книг, осуществлять поиск
книг в каталоге.
• Администратор может модифицировать каталог.
• *При добавлении описания книги в каталог оповещение о ней рассылается на
e-mail всем пользователям
• **При просмотре каталога желательно реализовать постраничный просмотр
• ***Пользователь может предложить добавить книгу в библиотеку, переслав её
администратору на e-mail.
• Каталог книг хранится в текстовом файле.
• Данные аутентификации пользователей хранятся в текстовом файле. Пароль
не хранится в открытом виде*/

public class Main {
	

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String command = "F:\\test";

		System.out.print("Введите директорию файлов библиотеки: ");
		//command = scanner.nextLine();
		FileManager fm = new FileManager(command);

		while (!fm.getDirectory().isDirectory()) {
			if (!fm.getDirectory().mkdir()) {
				System.out
						.print("Данной директории не существует и её невозможно создать...\n" + "Введите новый путь: ");
				command = scanner.nextLine();
				fm.setDirectory(command);
			} else {
				System.out.println("Создан новый каталог");
			}

		}

		if (!fm.existsCatalog()) {
			fm.createFile(Catalog.FILE_NAME);
		}
		Catalog catalog = new Catalog(fm.readCatalog());
		
		System.out.println(catalog);

		if (!fm.existsUsersBase()) {
			fm.createFile(UsersBase.FILE_NAME);
		}
		UsersBase usersBase = new UsersBase(fm.readUsersBase(UsersBase.FILE_NAME));
		System.out.println(usersBase);
		
		
	}

}
