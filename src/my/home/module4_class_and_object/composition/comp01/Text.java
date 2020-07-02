package my.home.module4_class_and_object.composition.comp01;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
	private Sentence header;
	private ArrayList<Sentence> text = new ArrayList<Sentence>();
	
	public Text(String header, String text) {
		this.header = new Sentence(header);
		addText(text);
	}
	
	public void addText(String addText) {
		Matcher matcher = Pattern.compile("[^\\.!\\?]+", Pattern.UNICODE_CASE).matcher(addText);
		while (matcher.find()) {
			this.text.add(new Sentence(matcher.group().toString() 
					                   + addText.charAt(matcher.regionEnd() - 1))); //+знак препинания
		}
	}
	
	public void printHeader() {
		System.out.println(header);
	}
	
	public void printText() {
		for (Sentence s : this.text) {
			System.out.print(s);
		}
		System.out.println();
	}
	
	public ArrayList<Sentence> getSentenceList() {
		return text;
	}
}
