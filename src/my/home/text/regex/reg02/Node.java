package my.home.text.regex.reg02;

import java.util.ArrayList;

public class Node {
	String tag;
	String value;
	String attribute;
	ArrayList<Node> nodes;
	
	public Node() {

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

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	@Override
	public String toString() {
		return "\r\nNode [tag=" + tag + ", value=" + value + ", attribute=" + attribute + ", nodes=" + nodes + "]";
	}



	
	

}
