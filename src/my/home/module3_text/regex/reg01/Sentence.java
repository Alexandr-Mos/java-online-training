package my.home.module3_text.regex.reg01;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
	List<Word> words;
	
	public Sentence(String[] arr) {
		words = new ArrayList<Word>();
		for(String s : arr) {
			words.add(new Word(s));
		}
	
	}

	public void setWords(List<Word> words) {
		this.words = words;
	}
	public List<Word> getWords() {
		return this.words;
	}
	
	public String toString() {
		return words.toString();
	}
}
