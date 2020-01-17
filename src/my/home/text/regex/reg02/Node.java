package my.home.text.regex.reg02;

import java.util.ArrayList;

public class Node {
	ArrayList<Node> nodes;
	String value;
	
	public Node(String value) {
		this.value = value;
	}

	public ArrayList<Node> getNodes() {
		return nodes;
	}

	public void setNodes(ArrayList<Node> nodes) {
		this.nodes = nodes;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
