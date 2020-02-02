package my.home.project.task2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;

public class FileManager {
	private File directory;
	private File notes;

	public FileManager(String directory, String file) {
		this.directory = new File(directory);
		this.notes = new File(directory + "\\" + file);
	}

	public ArrayList<Note> readFile() {
		ArrayList<Note> data = null;
		try (FileReader fileReader = new FileReader(notes)) {
			CsvToBeanBuilder<Note> builder = new CsvToBeanBuilder<Note>(fileReader);
			data = (ArrayList<Note>) builder.withType(Note.class).build().parse();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	public void writeFile(Notebook notebook) {
		try (FileWriter fileWriter = new FileWriter(notes)) {
			StatefulBeanToCsv<Note> beanToCsv = new StatefulBeanToCsvBuilder<Note>(fileWriter).build();
			beanToCsv.write(notebook.getNotes());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
