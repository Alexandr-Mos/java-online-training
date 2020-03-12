package my.home.classes.cl06;

public class Time {
	private int hours;
	private int minutes;
	private int seconds;

	public Time() {
		this.hours = 0;
		this.minutes = 0;
		this.seconds = 0;
	}

	public void setTime(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
		checkTime();
	}

	private void checkTime() {
		if (hours < 0 || 23 < hours) {
			this.hours = 0;
		}
		if (minutes < 0 || 59 < minutes) {
			this.minutes = 0;
		}
		if (seconds < 0 || 59 < seconds) {
			this.seconds = 0;
		}
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
		checkTime();
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
		checkTime();
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
		checkTime();
	}

	public String toString() {
		return "hs: " + hours + " ms: " + minutes + " ss: " + seconds;
	}

}
