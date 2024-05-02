package clinic;

import java.util.ArrayList;

public class Physician {
	private String name;
	// array of hours available in 24 time format
	private int[] avalableHours;
	private ArrayList<String> appointments;
	
//Constructor
	
	// hour is in 24 time eg 5am = 5 and 5pm = 17
	// each hour should be listed in avalableHours 
	//if physician is available from 6am to 10pm (6,7,8,9,10,11,12,13,14,15,16,17)
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

	public ArrayList<String> getAppointments() {
		return appointments;
	}
	
//Methods
	public Boolean isAvailable(int hour) {
		 
		for (int i = 0; i < avalableHours.length; i++) {
			if (avalableHours[i] == hour) {
				return true;
			}
		}
		return false;
		
	}

	public void addAppointment(Patient patient, int hour) {
		
		String appointment = patient.getName() + " " + patient.getNationalId() + ": " + hour;
		appointments.add(appointment);
		
	}
	
	public void ListAppointments() {
		
		System.out.println(appointments.toString());
		
	}

}
