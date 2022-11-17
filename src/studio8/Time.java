package studio8;

import java.util.Objects;

public class Time {

	private int hours;
	private int minutes;
	private boolean format;
	
	/**
	 * Creates a new Time.
	 * @param hours The time in hours, minus any minutes.
	 * @param minutes That remaining quantity of minutes from the hours.
	 * @param format Whether or not the time is in 12 or 24 hour format, true and false respectively.
	 */
	public Time(int hours, int minutes, boolean format) {
		this.hours = hours;
		this.minutes = minutes;
		this.format = format;
	}
	
	public String toString() {
		int newHours = ((hours==0)&&format) ? 12 : hours;
		String segment = (format) ? ((newHours>12) ? " PM" : " AM"): "";
		if(newHours>12&&format) {
			newHours = (newHours>12) ? newHours-12 : newHours;
		}
		return newHours + ":" + ((minutes<10) ? "0" + minutes : minutes) + segment;
	}
	// ((minutes<10) ? "0" + minutes : minutes)
	@Override
	public int hashCode() {
		return Objects.hash(hours, minutes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hours == other.hours && minutes == other.minutes;
	}

	public static void main(String[] args) {
		Time bedtime = new Time(21, 0, true);
		Time bedtimeFancy = new Time(21, 0, false);
		System.out.println(bedtime.equals(bedtimeFancy));
    	
    }

}