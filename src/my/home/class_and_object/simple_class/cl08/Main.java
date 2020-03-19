package my.home.class_and_object.simple_class.cl08;

/*Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
и методами. Задать критерии выбора данных и вывести эти данные на консоль.
	Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
	Найти и вывести:
	a) список покупателей в алфавитном порядке;
	b) список покупателей, у которых номер кредитной карточки находится в заданном интервале*/

public class Main {

	public static void main(String[] args) {
		BankMembers bank = new BankMembers();
		
		//Заполнение случайными покупателями
		for (int i = 0; i < 10; i++) {
			int temp = (int) (Math.random() * (i + 80) + 10);
			Customer c = new Customer("Customer" + temp, "SecondName", "LastName");
			c.setCardNumber(temp * 12345);
			c.setBankAccNumber(temp * 456789);
			c.setAddress("Paris " + temp);
			bank.addMember(c);
		}
		
		System.out.println("Покупатели в алфавитном порядке:");
		bank.showAllMembers();
		
		System.out.println("Покупатели по номерам карты:");
		bank.showMebersByCard(256000, 640000);
		
	}

}
