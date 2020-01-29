package my.home.project.task1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {
	private File directory;
	private File catalog;
	private File usersBase;

	public FileManager(String directory) {
		this.directory = new File(directory);
		this.catalog = new File(directory + "\\" + Catalog.FILE_NAME);
		this.usersBase = new File(directory + "\\" + UsersBase.FILE_NAME);
	}

	public boolean existsCatalog() {
		return catalog.exists();
	}

	public boolean existsUsersBase() {
		return usersBase.exists();
	}

	public boolean createFile(String name) {
		File file = new File(directory, name);
		try {
			if (!file.exists()) {
				return file.createNewFile();
			} else {
				System.out.println("Файл с таким именем уже создан");
			}
		} catch (IOException e) {
			System.out.println("Ошибка при создании файла: " + e.getMessage());
		}
		return false;
	}

	public void writeFile(String name, String data) {
		try (FileWriter fileWriter = new FileWriter(new File(directory, name), true)) {
			fileWriter.write(data);
		} catch (IOException e) {
			System.out.println("Ошибка записи файла: " + e.getMessage());
		}
	}

	public ArrayList<String> readFile(String name) {
		ArrayList<String> data = new ArrayList<String>();

		try (Scanner scanner = new Scanner(new FileReader(new File(getDirectory(), name)))) {
			while (scanner.hasNextLine()) {
				data.add(scanner.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Ошибка чтения файла: " + e.getMessage());
		}

		return data;
	}

	public ArrayList<Book> readCatalog() {
		ArrayList<Book> data = new ArrayList<Book>();

		try (Scanner scanner = new Scanner(new FileReader(catalog))) {
			while (scanner.hasNextLine()) {
				Book book = new Book();
				if (scanner.hasNextInt()) {
					book.setId(Integer.valueOf(scanner.nextLine()));
				} else {
					book.setId(-1);
				}

				if (scanner.hasNextLine()) {
					book.setName(scanner.nextLine());
				} else {
					book.setName("");
				}

				if (scanner.hasNextLine()) {
					book.setAuthor(scanner.nextLine());
				} else {
					book.setAuthor("");
				}

				if (scanner.hasNextInt()) {
					book.setYear(Integer.valueOf(scanner.nextLine()));
				} else {
					book.setYear(-1);
				}

				if (scanner.hasNextLine()) {
					book.setContent(scanner.nextLine());
				} else {
					book.setContent("");
				}

				data.add(book);
			}
		} catch (Exception e) {
			System.out.println("Ошибка чтения файла: " + e.getMessage());
		}

		return data;
	}

	public ArrayList<User> readUsersBase(String name) {
		ArrayList<User> data = new ArrayList<User>();

		try (Scanner scanner = new Scanner(new FileReader(usersBase))) {
			while (scanner.hasNextLine()) {
				String[] s = scanner.nextLine().split(" ");
				User user = new User();
				if (s.length == 3) {
					user.setEmail(s[0]);
					user.setPassword(s[1]);
					user.setAdmin(Boolean.parseBoolean(s[2]));
				}
				data.add(user);
			}
		} catch (IOException e) {
			System.out.println("Ошибка чтения файла: " + e.getMessage());
		}

		return data;
	}

	public File getDirectory() {
		return directory;
	}

	public void setDirectory(String directory) {
		this.directory = new File(directory);
	}

	@Override
	public String toString() {
		return "FileManager [directory=" + directory + "]";
	}

}
