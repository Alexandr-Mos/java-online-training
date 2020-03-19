package my.home.class_and_object.composition.comp02;

import java.util.ArrayList;

public class Car {
	private String model;
	private Engine engine;
	private ArrayList<Wheel> wheels;
	
	public Car(String model) {
		this.model = model;
		this.engine = new Engine();
		this.wheels = new ArrayList<>();
		this.wheels.add(new Wheel("left-front"));
		this.wheels.add(new Wheel("right-front"));
		this.wheels.add(new Wheel("left-back"));
		this.wheels.add(new Wheel("right-back"));
	}
	
	public void changeWheel(String oldWheel, Wheel newWheel) {
		
		for (Wheel w : wheels) {
			
			if (w.getName().equals(oldWheel)) {
				wheels.remove(w);
				wheels.add(newWheel);
				System.out.println("Removed: " + w + " Added: " + newWheel);
				return;
			}
			
		}
		System.out.println("Такое колесо не найдено");
		
	}
	
	public void go(int speed) {
		engine.start();
		
		if (engine.getLevelFuel() > 0) {
			engine.setSpeed(speed);
		}
	}
	
	public void stop() {
		engine.setSpeed(0);
		engine.stop();
	}
	
	public void fillFuel(int fuel) {
		engine.setLevelFuel(fuel);
		System.out.println("Level fuel now: " + fuel);
	}
	
	public void getModel() {
		System.out.println("Model: " + model);
	}

}
