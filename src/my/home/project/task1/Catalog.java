package my.home.project.task1;

import java.util.ArrayList;

public class Catalog {
	private ArrayList<Book> catalog;
	public static final String FILE_NAME = "catalog.txt";
	
	public Catalog(ArrayList<Book> catalog) {
		this.catalog = catalog;
	}
	
	public void addBook(Book book) {
		catalog.add(book);
	}
	
	public void removeBook(int id) {
		for (Book b : catalog) {
			if (b.getId() == id) {
				catalog.remove(b);
				return;
			}
		}
	}
	
	public void search(String name) {
		for (Book b : catalog) {
			if (b.getName().toLowerCase().contains(name.toLowerCase())) {
				System.out.println(b);
			}
		}
	}
	
	public int size() {
		return catalog.size();
	}
	
	public Book get(int i) {
		return catalog.get(i);
	}

	public ArrayList<Book> getCatalog() {
		return catalog;
	}

	public void setCatalog(ArrayList<Book> catalog) {
		this.catalog = catalog;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Book b : catalog) {
			sb.append(b.getId() + "\n");
			sb.append(b.getName() + "\n");
			sb.append(b.getAuthor() + "\n");
			sb.append(b.getYear() + "\n");
			sb.append(b.getContent() + "\n");
		}
		return sb.toString();
	}
	
	

}
