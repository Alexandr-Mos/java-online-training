package my.home.text.regex.reg01;

import java.util.ArrayList;
import java.util.List;

public class Paragraph {
	List<Sentence> sentences;
	
	public Paragraph() {
		this.sentences = new ArrayList<Sentence>();
	}
	
	public void setSentences(List<Sentence> sentences) {
		this.sentences = sentences;
	}
	public List<Sentence> getSentences() {
		return this.sentences;
	}
	
	public String toString() {
		return sentences.toString();
	}

}
