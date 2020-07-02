package my.home.module4_class_and_object.composition.comp05;

public class Main {

	public static void main(String[] args) {
		VoucherList list = new VoucherList();
		list.addVoucher(new Voucher("Карибские острова", Type.REST)
			     		.setDays(15)
			     		.setTransport(Transport.SHIP)
			     		.setFood(Food.ALL_INCLUSIVE)
			     		.setPrice(20000));
		list.addVoucher(new Voucher("Кипр", Type.TOUR)
		     	 		.setDays(7)
		     	 		.setTransport(Transport.BUS)
		     	 		.setFood(Food.HALF_BOARD)
		     	 		.setPrice(1000));
		list.addVoucher(new Voucher("Сочи", Type.THERAPY)
		     	 		.setDays(15)
		     	 		.setTransport(Transport.TRAIN)
		     	 		.setFood(Food.ALL_INCLUSIVE)
		     	 		.setPrice(2000));
		list.addVoucher(new Voucher("Эверест", Type.HIKE)
		      			.setDays(5)
		      			.setTransport(Transport.FOOT)
		      			.setFood(Food.ROOM_ONLY)
		      			.setPrice(10000));
		list.showVouchers();
		System.out.println("----По цене----");
		list.sortByPrice();
		list.showVouchers();
		System.out.println("----По длительности----");
		list.sortByDays();
		list.showVouchers();
		System.out.println("----По алфавиту----");
		list.sortByPlace();
		list.showVouchers();
		VoucherList searchResult = list.getVouchersBy(new Request(Transport.ANY, Food.ANY, 15));
		
		System.out.println("----По запросу----");
		searchResult.showVouchers();
	

	}

}
