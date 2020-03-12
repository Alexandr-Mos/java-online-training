package my.home.classes.cl08;

public class Customer {
	private int id;
	private String LastName;
	private String firstName;
	private String secondName;
	private String address;
	private long cardNumber;
	private long bankAccNumber;
	private static int counterr;

	public Customer() {

	}

	public Customer(String firstName, String secondName, String lastName) {
		incremetCounter();
		this.id = getCustomerCounter();
		this.firstName = firstName;
		this.secondName = secondName;
		LastName = lastName;
	}

	private void incremetCounter() {
		Customer.counterr++;
	}

	private int getCustomerCounter() {
		return Customer.counterr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public long getBankAccNumber() {
		return bankAccNumber;
	}

	public void setBankAccNumber(long bankAccNumber) {
		this.bankAccNumber = bankAccNumber;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", LastName=" + LastName + ", firstName=" + firstName + ", secondName="
				+ secondName + ", address=" + address + ", cardNumber=" + cardNumber + ", bankAccNumber="
				+ bankAccNumber + "]";
	}

}
