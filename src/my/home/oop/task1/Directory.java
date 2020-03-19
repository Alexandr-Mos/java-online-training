package my.home.oop.task1;

public class Directory {
	private String path;
	
	
	public Directory(String path) {
		this.path = path;
	}

	public String getPath() {
		return path + "\\";
	}

	@Override
	public String toString() {
		return "Directory [path=" + path + "\\" + "]";
	}

}
