package my.home.class_and_object.composition.comp03;

/*Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
столицу, количество областей, площадь, областные центры. */

public class Main {

	public static void main(String[] args) {
		City capitalCity = new City("Minsk");

		Country BELARUS = new Country(capitalCity);

		Region minskRegion = new Region(capitalCity, 485);
		Region logoiskRegion = new Region(new City("Logoisk"), 476);
		Region soligorskRegion = new Region(new City("Soligorsk"), 764);
		
		State minskayaOblast = new State(minskRegion);
		minskayaOblast.addRegion(logoiskRegion);
		minskayaOblast.addRegion(soligorskRegion);
		
		Region brestRegion = new Region(new City("Brest"), 451);
		Region pinskRegion = new Region(new City("Pinsk"), 423);
		Region kobrinRegion = new Region(new City("Kobrin"), 543);
		Region stolinRegion = new Region(new City("Stolin"), 384);
		
		State breststkayaOblast = new State(brestRegion);
		breststkayaOblast.addRegion(pinskRegion);
		breststkayaOblast.addRegion(kobrinRegion);
		breststkayaOblast.addRegion(stolinRegion);
		
		BELARUS.addState(minskayaOblast);
		BELARUS.addState(breststkayaOblast);
		
		
		BELARUS.getArea();
		
		BELARUS.getCapitalCity();
		
		BELARUS.getStatesNumber();
		
		BELARUS.getCapitalCitiesStates();
		
	}

}
