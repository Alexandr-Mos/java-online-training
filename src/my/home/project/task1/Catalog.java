package my.home.project.task1;

import java.util.ArrayList;

public class Catalog {
	private ArrayList<Book> catalog;
	public static final String FILE_NAME = "catalog.txt";
	
	public Catalog() {
		catalog = null;
	}
	
	public Catalog(ArrayList<Book> catalog) {
		this.catalog = catalog;
	}

	public ArrayList<Book> getCatalog() {
		return catalog;
	}

	public void setCatalog(ArrayList<Book> catalog) {
		this.catalog = catalog;
	}

	@Override
	public String toString() {
		return "Catalog " + catalog;
	}
	
	

}
