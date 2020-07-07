package my.home.module5_oop.task5;

import java.util.ArrayList;

public class GiftBuilder {
	private BoxType boxType;
	private Wrap wrap;
	private ArrayList<String> decoration;
	private ArrayList<Candy> candies;
	private String toy;
	
	public GiftBuilder() {
		decoration = new ArrayList<String>();
		candies = new ArrayList<Candy>();
	}
	
	public GiftBuilder withBoxType(BoxType boxType) {
		this.boxType = boxType;
		return this;
	}
	
	public GiftBuilder withWrap(Wrap wrap) {
		this.wrap = wrap;
		return this;
	}
	
	public GiftBuilder withDecoration(String decoration) {
		this.decoration.add(decoration);
		return this;
	}
	
	public GiftBuilder withCandy(Candy candy) {
		this.candies.add(candy);
		return this;
	}
	
	public GiftBuilder withToy(String toy) {
		this.toy = toy;
		return this;
	}
	
	public Gift build() {
		return new Gift(this);
	}

	public BoxType getBoxType() {
		return boxType;
	}

	public Wrap getWrap() {
		return wrap;
	}

	public ArrayList<String> getDecoration() {
		return decoration;
	}

	public ArrayList<Candy> getCandies() {
		return candies;
	}

	public String getToy() {
		return toy;
	}

	
}
