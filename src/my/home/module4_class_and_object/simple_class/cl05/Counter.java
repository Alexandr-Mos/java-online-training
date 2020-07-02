package my.home.module4_class_and_object.simple_class.cl05;

public class Counter {
	private int value;

	public Counter() {
		this.value = 0;
	}

	public Counter(int value) {
		if (value > 9) {
			this.value = 9;
		} else if (value < 0) {
			this.value = 0;
		} else {
			this.value = value;
		}
	}

	public void increment() {
		value++;
		if (value > 9) {
			value = 0;
		}
	}

	public void decrement() {
		value--;
		if (value < 0) {
			value = 9;
		}
	}

	public int state() {
		return value;
	}

}
