package my.home.module5_oop.task5;

import java.util.ArrayList;

public class GiftCollector {
	private GiftBuilder giftBuilder;
	
	public GiftCollector() {
		giftBuilder = new GiftBuilder();
	}
	
	public GiftCollector addBox(BoxType boxType) {
		giftBuilder.withBoxType(boxType);
		System.out.println("Box type set: " + boxType);
		return this;
	}
	
	public GiftCollector addWrap(Wrap wrap) {
		giftBuilder.withWrap(wrap);
		System.out.println("Wrap set: " + wrap);
		return this;
	}
	
	public GiftCollector addDecoration(String decoration) {
		if (giftBuilder.getDecoration().contains(decoration)) {
			System.out.println("This type of decoration already added: " + decoration);
			return this;
		}
		giftBuilder.withDecoration(decoration);
		System.out.println("Decoration added: " + decoration);
		return this;
	}
	
	public GiftCollector addCandy(Candy candy) {
		ArrayList<Candy> candies = giftBuilder.getCandies();
		
		if (candies.contains(candy)) {
			int indexOfCandy = candies.indexOf(candy);
			
			candies.get(indexOfCandy).addQuantity(candy.getQuantity());
			System.out.println("This candy already exists, quantity added: " + candy);
			return this;
		}
		
		giftBuilder.withCandy(candy);
		System.out.println("Candy added: " + candy);
		return this;
	}
	
	public GiftCollector addToy(String toy) {
		giftBuilder.withToy(toy);
		System.out.println("Toy set: " + toy);
		return this;
	}
	
	public Gift build() {
		return giftBuilder.build();
	}


}
