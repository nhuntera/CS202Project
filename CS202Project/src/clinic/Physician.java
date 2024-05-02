package clinic;

import java.util.ArrayList;

public class Physician {
	private String name;
	// array of hours available in 24 time format
	private int[] avalableHours;
	private ArrayList<String> appointments;
//Constructor
	public void physician(String name, int[] avalableHours) {
		this.name = name;
		this.avalableHours = avalableHours;
		
		this.appointments = new ArrayList<String>();
		
	}
	
//Getters
	public String getName() {
		return name;
	}
	
	public int[] getAvalableHours() {
		return avalableHours;
	}
	
	public Boolean isAvailable(int hour) {
		 
		for (int i = 0; i < avalableHours.length; i++) {
			if (avalableHours[i] == hour) {
				return true;
			}
		}
		return false;
		
	}
	
	public void addAppointment(String appointment) {
		
		appointments.add(appointment);
		
	}
	
	public void ListAppointments() {
		
		System.out.println(appointments.toString());
		
	}

}
