package studio8;

import java.util.Objects;

public class Appointment {
	private Date date;
	private Time time;
	
	/**
	 * Creates a new Appointment.
	 * @param date The date of the appointment.
	 * @param time The time of the appointment.
	 */
	public Appointment(Date date, Time time) {
		this.date = date;
		this.time = time;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the time
	 */
	public Time getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(Time time) {
		this.time = time;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Appointment appoint1 = new Appointment(new Date(12, 31, 2023, false), new Time (0, 0, false));
		Appointment appoint2 = new Appointment(new Date(2, 31, 2024, true), new Time (0, 0, false));
		System.out.println(appoint1.equals(appoint2));
	}

	@Override
	public String toString() {
		return "Appointment at " + date.toTrimmedString() + ", and Time " + time;
	}

}
