package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private int month;
	private int day;
	private int year;
	private boolean isHoliday;
	
	

    /**
     * Creates a new Date.
	 * @param month The month of the date.
	 * @param day The day of the date.
	 * @param year The year of the date.
	 * @param isHoliday Whether or not the Date is a holiday.
	 */
	public Date(int month, int day, int year, boolean isHoliday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.isHoliday = isHoliday;
	}

	public String toString() {
		return month + "-" + day + "-" + year + " is " + ((isHoliday) ? "a holiday" : "a holiday");
	}
	
	public String toTrimmedString() {
		return month + "-" + day + "-" + year;
	}

	public static void main(String[] args) {
		Date newYears = new Date(12, 31, 2022, true);
		Date newYears23 = new Date(12, 31, 2023, true);
		Date newYears24 = new Date(12, 31, 2024, true);
		Date newYears25 = new Date(12, 31, 2024, true);
		Date janFirst23 = new Date(1, 1, 2023, true);
		HashSet<Date> set = new HashSet<Date>();
		set.add(newYears);
		set.add(newYears23);
		set.add(newYears24);
		set.add(newYears25);
		set.add(janFirst23);
		System.out.println(set);
    }

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

}
