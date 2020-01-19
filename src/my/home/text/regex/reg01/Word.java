package my.home.text.regex.reg01;

public class Word {
	String value;
	Integer matches;
	
	public Word(String s) {
		this.value = s;
		this.matches = 0;
	}
	
	public void incrementMatches() {
		setMatches(getMatches().intValue() + 1);
	}
	
	public int compareTo(Word w) {
		if (this.matches.compareTo(w.getMatches()) != 0) {
			return this.matches.compareTo(w.getMatches());
		} else {
			return w.getValue().toLowerCase().compareTo(this.value.toLowerCase());
		}
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public Integer getMatches() {
		return matches;
	}
	public
	void setMatches(Integer matches) {
		this.matches = matches;
	}
	
	public String toString() {
		return this.value;
	}

}
