package my.home.project.task1;

public class Book {
	private int id;
	private String name;
	private String author;
	private int year;
	private String content;

	private static int counter;

	public Book() {
		Book.incrementCounter();
		this.id = Book.counter;
	}

	public Book(String name, String author, int year, String content) {
		Book.incrementCounter();
		this.id = Book.counter;
		this.name = name;
		this.author = author;
		this.year = year;
		this.content = content;
	}

	private static void incrementCounter() {
		Book.counter++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", year=" + year + ", \ncontent=" + content
				+ "]";
	}

}
