package my.home.oop.task1;

public class Directory {
	private String path;
	private String name;
	
	public Directory(String path, String name) {
		this.path = path;
		this.name = name;
	}

	public String getPath() {
		return path + name + "\\";
	}

	@Override
	public String toString() {
		return "Directory [path=" + path + "\\" + "]";
	}

}
