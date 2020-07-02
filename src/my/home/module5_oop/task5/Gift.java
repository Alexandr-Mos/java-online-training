package my.home.module5_oop.task5;

import java.util.ArrayList;

public class Gift {
	private BoxType boxType;
	private Wrap wrap;
	private String decoration;
	private ArrayList<Candy> candies;
	private String toy;
	
	public Gift(GiftBuilder giftBuilder) {
		boxType = giftBuilder.getBoxType();
		wrap = giftBuilder.getWrap();
		decoration = giftBuilder.getDecoration();
		candies = giftBuilder.getCandies();
		toy = giftBuilder.getToy();
	}

	public BoxType getBoxType() {
		return boxType;
	}

	public void setBoxType(BoxType boxType) {
		this.boxType = boxType;
	}

	public Wrap getWrap() {
		return wrap;
	}

	public void setWrap(Wrap wrap) {
		this.wrap = wrap;
	}

	public String getDecoration() {
		return decoration;
	}

	public void setDecoration(String decoration) {
		this.decoration = decoration;
	}

	public ArrayList<Candy> getCandies() {
		return candies;
	}

	public void setCandies(ArrayList<Candy> candies) {
		this.candies = candies;
	}

	public String getToy() {
		return toy;
	}

	public void setToy(String toy) {
		this.toy = toy;
	}

	@Override
	public String toString() {
		return "Gift [boxType=" + boxType + ", wrap=" + wrap + ", decoration=" + decoration + ", candies=" + candies
				+ ", toy=" + toy + "]";
	}
}
