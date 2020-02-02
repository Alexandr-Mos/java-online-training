package my.home.project.task2;

import java.util.Date;

import com.opencsv.bean.CsvBindByName;

public class Note {
	
	@CsvBindByName
	private String head;
	
	@CsvBindByName
	private Date date;
	
	@CsvBindByName
	private String email;
	
	@CsvBindByName
	private String text;
	
	public Note() {
		
	}
	
	public Note(String head, Date date, String email, String text) {
		super();
		this.head = head;
		this.date = date;
		this.email = email;
		this.text = text;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return head + ";" + date + ";" + email + ";" + text;
	}

}
