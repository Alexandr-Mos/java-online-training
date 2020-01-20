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
		this.hours = checkTime(hours);
		this.minutes = checkTime(minutes);
		this.seconds = checkTime(seconds);
	}
	
	private int checkTime(int time) {
		if (time < 0 || 59 < time) {
			return 0;
		} else {
			return time;
		}
	}
	
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = checkTime(hours);
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = checkTime(minutes);
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = checkTime(seconds);
	}
	
	public String toString() {
		return "h: " + hours + " m: " + minutes + " s: " + seconds;
	}

}
