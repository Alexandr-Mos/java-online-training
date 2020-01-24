package my.home.classes.composition.comp05;

import java.util.ArrayList;
import java.util.Comparator;

public class VoucherList {
	ArrayList<Voucher> vouchers;
	
	public VoucherList() {
		this.vouchers = new ArrayList<Voucher>();
	}
	
	public void addVoucher(Voucher voucher) {
		this.vouchers.add(voucher);
	}
	
	public VoucherList getVouchersBy(Request request) {
		VoucherList temp = new VoucherList();
		
		for (Voucher v : vouchers) {
			if ((request.getTransport() == Transport.ANY || request.getTransport() == v.getTransport())
				&& (request.getFood() == Food.ANY || request.getFood() == v.getFood())
				&& (request.getDays() == v.getDays())) {
				
				temp.addVoucher(v);
			}
		}
		return temp;
	}
	
	public void sortByPrice() {
		Comparator<Voucher> com = (p1, p2) -> Integer.valueOf(p1.getPrice()).compareTo(Integer.valueOf(p2.getPrice()));
		vouchers.sort(com);
	}
	
	public void sortByPlace() {
		Comparator<Voucher> com = (p1, p2) -> p1.getPlace().compareTo(p2.getPlace());
		vouchers.sort(com);
	}
	
	public void sortByDays() {
		Comparator<Voucher> com = (p1, p2) -> Integer.valueOf(p1.getDays()).compareTo(Integer.valueOf(p2.getDays()));
		vouchers.sort(com);
	}
	
	public void showVouchers() {
		for (Voucher v : vouchers) {
			System.out.println(v);
		}
	}
	
}
