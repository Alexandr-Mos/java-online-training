package my.home.project.task1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {
	private File directory;

	public FileManager(String directory) {
		this.directory = new File(directory);
	}
	
	public boolean createFile(String name) {
		File file = new File(directory, name);
		try {
			if (!file.exists()) {
				return file.createNewFile();	
			} else {
				System.out.println("Файл уже создан");
			}
		} catch (IOException e) {
			System.out.println("Ошибка при создании файла: " + e.getMessage());
		}
		return false;
}
	 
	public void writeFile(String name, String data) {
		try {
			FileWriter fileWriter = new FileWriter(new File(directory, name), false);
			fileWriter.write(data);
			fileWriter.close();
		} catch (IOException e) {
			System.out.println("Ошибка записи файла: " + e.getMessage());
		}
	}
	
	public ArrayList<String> readFile(String name){
		ArrayList<String> data = new ArrayList<String>();
		
		try {
			Scanner scanner = new Scanner(new FileReader(new File(getDirectory(), name)));
			while (scanner.hasNext()) {
				data.add(scanner.nextLine());
			}
			scanner.close();
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
