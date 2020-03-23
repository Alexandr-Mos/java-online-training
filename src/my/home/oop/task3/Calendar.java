package my.home.oop.task3;

import java.util.ArrayList;

public class Calendar {
	private int year;
	private ArrayList<Day> days;

	public Calendar(int year) {
		this.year = year;
		this.days = new ArrayList<Day>();
	}

	public void addHoliday(int number, Month month, DayOfWeek day, String description) {
		this.days.add(new Day(number, month, day, true, description));
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public ArrayList<Day> getDays() {
		return days;
	}

	public void setDays(ArrayList<Day> days) {
		this.days = days;
	}

	@Override
	public String toString() {
		return "Calendar [year=" + year + ", \r\ndays=" + days + "]";
	}

	class Day {
		private int number;
		private Month month;
		private DayOfWeek day;
		private boolean isHoliday;
		private String description;

		public Day(int number, Month month, DayOfWeek day, boolean isHoliday, String description) {
			this.number = number;
			this.month = month;
			this.day = day;
			this.isHoliday = isHoliday;
			this.description = description;
		}

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		public Month getMonth() {
			return month;
		}

		public void setMonth(Month month) {
			this.month = month;
		}

		public DayOfWeek getDay() {
			return day;
		}

		public void setDay(DayOfWeek day) {
			this.day = day;
		}

		public boolean isHoliday() {
			return isHoliday;
		}

		public void setHoliday(boolean isHoliday) {
			this.isHoliday = isHoliday;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		@Override
		public String toString() {
			return "\r\nDay [" + "\r\n\tnumber=" + number + ", \r\n\tmonth=" + month + ", \r\n\tday=" + day
					+ ", \r\n\tisHoliday=" + isHoliday + ", \r\n\tdescription=" + description + "]";
		}

	}

}
