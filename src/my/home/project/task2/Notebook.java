package my.home.project.task2;

import java.util.ArrayList;

public class Notebook {
	private ArrayList<Note> notes;
	public static String FILE_NAME = "notes.csv";
	
	public Notebook() {
		notes = new ArrayList<Note>();
	}

	public ArrayList<Note> getNotes() {
		return notes;
	}

	public void setNotes(ArrayList<Note> notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "Notebook [notes=" + notes + "]";
	}
	
	
}
