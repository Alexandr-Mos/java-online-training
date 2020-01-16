package my.home.text.regex;

public class Paragraph {
	Sentence[] sentences;
	
	public Paragraph(Sentence[] sentences) {
		this.sentences = sentences;
	}
	
	public void setSentences(Sentence[] sentences) {
		this.sentences = sentences;
	}
	public Sentence[] getSentences() {
		return this.sentences;
	}

}
