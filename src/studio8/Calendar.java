package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Calendar {
	private LinkedList<Appointment> appointments;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * @param appointments
	 */
	public Calendar(LinkedList<Appointment> appointments) {
		this.appointments = appointments;
	}
	
	public void add(Appointment appoint) {
		appointments.add(appoint);
	}
	
	public void remove(Appointment appoint) {
		appointments.remove(appoint);
	}
	public void remove(int i) {
		appointments.remove(i);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(appointments);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calendar other = (Calendar) obj;
		return Objects.equals(appointments, other.appointments);
	}
	@Override
	public String toString() {
		return appointments.toString();
	}

}
